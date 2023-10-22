import java.time.LocalDateTime;

public class RingingState extends State{

    private Boolean ringOn;
    public RingingState(Clock clock) throws InterruptedException {
        super(clock);
        ringOn = true;
        for (int i = 0; i < 5; i++) {
            System.out.println("dring dring..");
        }
    }

    @Override
    public void arm(LocalDateTime hour) {
        System.out.println("Arm request: /!\\ Alarm is ringing..");
    }

    @Override
    public void disarm() {
        System.out.println("Disarm request: /!\\ Alarm is ringing..");
    }

    @Override
    public void stop() {
        try {
            this.ringOn = false;
            clock.changeState(new ReadyState(clock));
            System.out.println("Stop request: Alarm ring stopped");
        } catch (Exception err) {

        }
    }

}
