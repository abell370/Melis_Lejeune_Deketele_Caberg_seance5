import java.time.LocalDateTime;

public class ReadyState extends State{

    public ReadyState(Clock clock){
        super(clock);
        clock.changeState(new RingingState(clock));
        int delta = LocalDateTime.now().compareTo(clock.getAlarmHour());
        try {
            Thread.sleep(delta);
            clock.triggerAlarm();
        } catch (Exception err) {

        }
    }

    @Override
    public void arm(LocalDateTime hour) {
        System.out.println("Arm request: Alarm hour already set");
    }

    @Override
    public void disarm() {
        clock.changeState(new ClockOffState(clock));
        System.out.println("Disarm request: Clock is turned off");
    }

    @Override
    public void stop() {
        clock.changeState(new ClockOffState(clock));
        System.out.println("Stop request: Alarm is turned off ");
    }

    @Override
    public void triggerAlarm() {
        
    }
}
