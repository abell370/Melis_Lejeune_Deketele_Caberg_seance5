public class ClockOffState extends State{

    public ClockOffState(Clock clock) {
        super(clock);
    }

    @Override
    public void arm(String hour) {
        clock.changeState(new ReadyState(clock));
        System.out.println("Arm request: Clock turned on");
        clock.setAlarm(hour);
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

    @Override
    public void triggerAlarm() {
        System.out.println("Trigger alarm request:  /!\\ Alarm is off");
    }

}
