/**
 * Created by Yezhov Sergey on 03.11.2014.
 *
 * Task 4.32: even/odd
 *
 * Ternary operator
 */
public class Task_4_32 {
    public static void main(String[] args) {
        char a = 43;
        String str = (a%2==0)?"even":"odd";
        System.out.println("Number is "+str);
    }
}