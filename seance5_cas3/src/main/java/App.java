import java.time.LocalDateTime;

import static java.lang.Thread.sleep;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();

        // alarm is off => lancer alarme pas possible
        clock.triggerAlarm();
        clock.arm(LocalDateTime.of(2023,10,17,18, 0));
        clock.disarm();
        clock.arm(LocalDateTime.of(2023,10,17,18,0));
        clock.triggerAlarm();
        clock.arm(LocalDateTime.of(2023,10,17,18,0));
        Thread.sleep(5000);
        clock.stopAlarm();
        clock.stopAlarm();
    }
}
