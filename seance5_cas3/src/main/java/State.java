public abstract class State {
    private Clock clock;

    public State(Clock clock) {
        this.clock = clock;
    }

    public abstract String onOn();
    public abstract String onOff();
    public abstract String onRing();

}
