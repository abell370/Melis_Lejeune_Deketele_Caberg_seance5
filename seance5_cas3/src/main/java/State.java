public abstract class State {
    Clock clock;

    public State(Clock clock) {
        this.clock = clock;
    }

    public abstract void arm(String hour);
    public abstract void disarm();
    public abstract void stop();
    public abstract void triggerAlarm();

}
