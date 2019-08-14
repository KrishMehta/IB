package UML.Time;

/**
 * Class created by Krish
 */

public class Tester {

    public static void main(String[] args) {
        Time time = new Time(8, 40, 15);
        time.setTime(23, 59, 59);
        //System.out.println(time.nextSecond());
        System.out.println(time.nextSecond());
        System.out.println(time.previousSecond());
        System.out.println(time);
    }

}
