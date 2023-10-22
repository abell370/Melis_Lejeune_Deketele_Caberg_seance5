import java.time.LocalDateTime;

public class ClockOffState extends State{

    public ClockOffState(Clock clock) {
        super(clock);
    }

    @Override
    public void arm(LocalDateTime hour) {
        System.out.println("Arm request: Clock turned on");
        clock.setAlarm(hour);
        clock.changeState(new ReadyState(clock));
    }

    @Override
    public void disarm() {
        if (clock.isOn()) {
            clock.setOn(false);
            System.out.println("Disarm request: Clock turned off");
        }
    }

    @Override
    public void stop() {
        System.out.println("Stop request:  /!\\ nothing to stop");
    }
}
