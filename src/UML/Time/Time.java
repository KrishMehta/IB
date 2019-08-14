package UML.Time;

/**
 * Class created by Krish
 */

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59)
            throw new TimeException();
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            throw new TimeException();
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59)
            throw new TimeException();
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59)
            throw new TimeException();
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public Time nextSecond() {
        if (++second == 60) {
            second = 0;
            minute++;
        }
        if (minute == 60) {
            minute = 0;
            hour++;
        }
        if (hour == 24) {
            hour = 0;
        }
        return this;
    }

    public Time previousSecond() {
        if (--second == -1) {
            second = 59;
            minute--;
        }
        if (minute == -1) {
            minute = 59;
            hour--;
        }
        if (hour == -1) {
            hour = 23;
        }
        return this;
    }

}
