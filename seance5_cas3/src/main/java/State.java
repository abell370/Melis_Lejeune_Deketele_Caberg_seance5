public abstract class State {
    Clock clock;

    public State(Clock clock) {
        this.clock = clock;
    }
    public abstract void onOn();
    public abstract void onOff();
    public abstract void onRing();

}
