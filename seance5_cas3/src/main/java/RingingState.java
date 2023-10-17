import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RingingState extends State{

    private Thread ringThread;
    public RingingState(Clock clock){
        super(clock);
    }

    @Override
    public void arm(String hour) {
        System.out.println("Arm request: /!\\ Alarm is ringing..");
    }

    @Override
    public void disarm() {
        System.out.println("Disarm request: /!\\ Alarm is ringing..");
    }

    @Override
    public void stop() {
        clock.changeState(new ReadyState(clock));
        System.out.println("Stop request: Alarm ring stopped");
    }

    @Override
    public void triggerAlarm() {
        for (int i = 10; i > 0; i--) {
            System.out.println("dring dring..");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
