import static java.lang.Thread.sleep;

public class App {
    public static void main(String[] args) {
        Clock clock = new Clock();

        // alarm is off => lancer alarme pas possible
        clock.triggerAlarm();
        clock.arm("17h30");
        clock.disarm();
        clock.arm("17h30");
        clock.triggerAlarm();
        clock.arm("11h00");
        clock.stopAlarm();
        clock.stopAlarm();
    }
}
