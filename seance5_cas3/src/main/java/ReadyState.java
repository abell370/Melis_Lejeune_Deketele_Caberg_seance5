import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class ReadyState extends State{

    public ReadyState(Clock clock){
        super(clock);
        System.out.println("Clock in ready state");
        try {
            Duration duration = Duration.between(LocalDateTime.now(), clock.getAlarmHour());
            System.out.println("Clock in ready state: wait to trigger alarm");
            Thread.sleep(duration.toMillis());
            clock.changeState(new RingingState(clock));
        } catch (Exception err) {

        }
    }

    @Override
    public void arm(LocalDateTime hour) {
        System.out.println("Arm request: Alarm hour already set");
    }

    @Override
    public void disarm() {
        clock.changeState(new ClockOffState(clock));
        System.out.println("Disarm request: Clock is turned off");
    }

    @Override
    public void stop() {
        clock.changeState(new ClockOffState(clock));
        System.out.println("Stop request: Alarm is turned off ");
    }

}
