public class ReadyState extends State{

    public ReadyState(Clock clock){
        super(clock);
    }

    @Override
    public void arm(String hour) {
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
        clock.changeState(new RingingState(clock));
        clock.triggerAlarm();
    }
}
