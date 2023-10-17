public class Clock {
    private State state;
    public Clock() {
        this.state = new ClockOffState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }
    public void arm(String hour){

    }
    public void triggerAlarm() {

    }
    public void stopAlarm(){

    }
    public void disarm(){

    }
}
