import java.time.LocalDateTime;

import static java.lang.Thread.sleep;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();

        LocalDateTime now = LocalDateTime.now();
        clock.arm(now.plusSeconds(10));
        clock.stopAlarm(); // stop alarm
    }
}
