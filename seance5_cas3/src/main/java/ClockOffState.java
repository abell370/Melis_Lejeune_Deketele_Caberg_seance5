public class ClockOffState extends State{

    public ClockOffState(Clock clock) {
        super(clock);
    }

    @Override
    public void onOn() {
    }

    @Override
    public void onOff() {
        if (clock.isOn()) {
            clock.changeState(new ClockOffState(clock));
            System.out.println("Clock is turner off");
        }
    }

    @Override
    public void onRing() {

    }
}
