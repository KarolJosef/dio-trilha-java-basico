package clock;

public sealed abstract  class Clock permits BRLClock, USClock {

    protected  int hour;
    protected  int minutes;
    protected  int second;


    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
       this.hour = hour>=24 ? 24 : hour;         
    
    }

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes >= 60? 60 :minutes;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
       this.second = second >= 60 ? 60  : second;
    }
    private String format(int value){
        return value < 9?"0" + value : String.valueOf(value);
    }
    public String getTime() {
        return format(hour) + ":" + format(minutes) + ":" + format(second);
    }

    abstract Clock convert(Clock clock);
    


}
