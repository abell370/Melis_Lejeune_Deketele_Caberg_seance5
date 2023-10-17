public class Clock {
    private State state;
    private Boolean isOn;
    public Clock() {
        this.state = new ClockOffState(this);
        this.isOn = false;
    }

    public void changeState(State state) {
        this.state = state;
    }
    public State getState(){
        return this.state;
    }
    public void arm(String hour){

    }
    public void triggerAlarm() {

    }
    public void stopAlarm(){

    }
    public void disarm(){

    }

    public boolean isOn() {
        return this.isOn;
    }
}
