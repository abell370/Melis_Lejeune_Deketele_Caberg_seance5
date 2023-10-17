public class RingingState extends State{

    private Boolean ringOn;
    public RingingState(Clock clock){
        super(clock);
        ringOn = false;
    }

    @Override
    public void arm(String hour) {
        System.out.println("Arm request: /!\\ Alarm is ringing..");
    }

    @Override
    public void disarm() {
        System.out.println("Disarm request: /!\\ Alarm is ringing..");
    }

    @Override
    public void stop() {
        this.ringOn = false;
        clock.changeState(new ReadyState(clock));
        System.out.println("Stop request: Alarm ring stopped");
    }

    @Override
    public void triggerAlarm() {
        this.ringOn = true;
        Thread t = new Thread(() -> {
            do {
                System.out.println("dring dring..");
                try {
                    Thread.sleep(100);
                } catch (Exception ex) {
                    Thread.currentThread().interrupt();
                }
            } while (RingingState.this.ringOn);
        });
        t.start();
    }
}
