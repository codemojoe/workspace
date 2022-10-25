public class AlarmClock {
    private static int nextId = 1;
    private static int numberOfTimesSetSnoozeIntervalIsInvoked = 0;
    private static int id;
    private int snoozeInterval = 99;

    public AlarmClock() {}

    public AlarmClock(int snoozeInterval) {
        this.id = nextId++;
        setSnoozeInterval(snoozeInterval);
    }

    public void snooze() {
        System.out.println("Snoozing " + snoozeInterval + " minutes.");
    }

    public void setSnoozeInterval(int snoozeInterval) {
        numberOfTimesSetSnoozeIntervalIsInvoked++;
        int oldValueLocal = this.snoozeInterval;
        this.snoozeInterval = snoozeInterval;
        System.out.println("old: " + oldValueLocal + " new: " + snoozeInterval + " id: " + nextId);
    }

    public void anotherMethod() {
        System.out.println("oldValue in anotherMethod = ");
    }

    public static int getNumberOfTimesSetSnoozeIntervalIsInvoked() {
        return numberOfTimesSetSnoozeIntervalIsInvoked;
    }

    public static int getNextId() {
        return nextId;
    }

    public static int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "AlarmClock{" +
                "id=" + id +
                ", snoozeInterval=" + snoozeInterval +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Invocation: " + AlarmClock.getNumberOfTimesSetSnoozeIntervalIsInvoked());

        AlarmClock alarmClock = new AlarmClock();
        alarmClock.setSnoozeInterval(100);
        alarmClock.snooze();

        System.out.println("Invocation: " + AlarmClock.getNumberOfTimesSetSnoozeIntervalIsInvoked());

        AlarmClock alarmClock1 = new AlarmClock(3);
        AlarmClock.getId();
        AlarmClock alarmClock2 = new AlarmClock(5);

        System.out.println("Invocation: " + AlarmClock.getNumberOfTimesSetSnoozeIntervalIsInvoked());
    }
}
