public class Clock {
    private State state;
    private Boolean isOn;
    private String alarmHour;
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
        state.arm(hour);
    }
    public void triggerAlarm() {
        state.triggerAlarm();
    }

    private boolean alarmTimeIsNow() {
        return true; // this.alarmHour == ?
    }

    public void stopAlarm(){
        state.stop();
    }
    public void disarm(){
        state.disarm();
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn(boolean on) {
        this.isOn = on;
    }

    public void setAlarm(String hour) {
        this.alarmHour = hour;
    }
}
