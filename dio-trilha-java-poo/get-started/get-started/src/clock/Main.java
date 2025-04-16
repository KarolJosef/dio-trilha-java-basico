package clock;

public class Main {
    public static void main(String[] args) {
        Clock brlclock = new BRLClock();
        brlclock.setSecond(30);
        brlclock.setMinutes(50);
        brlclock.setHour(25);

        System.out.println(brlclock.getTime());

        System.out.println(new USClock().convert(brlclock).getTime());
    }
}
