/**
 * Created by Yezhov Sergey on 02.11.2014.
 *
 * Task 4.15: age
 */
public class Task_4_15 {
    public static void main(String[] args) {
        int currYear=2014, currMonth=5;
        int birthYear=1972, birthMonth=5;

        int age = currYear-birthYear;
        if (currMonth<birthMonth) {
            age--;
        }
        System.out.println("Age is: "+age);
    }
}