/**
 * Created by Yezhov Sergey on 03.11.2014.
 *
 * Task 4.63: day of a year
 */
public class Task_4_63 {
    public static void main(String[] args) {
        char t = 42; // k = 1...365
        if (t%7>=1 && t%7<=5) {
            System.out.println("Workday");
        }
        else {
            System.out.println("Weekend");
        }
    }
}