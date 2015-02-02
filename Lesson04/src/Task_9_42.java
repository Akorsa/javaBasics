/**
 * Created by Yezhov Sergey on 06.11.2014.
 *
 * Task 9.42: reverse string
 *
 */

public class Task_9_42 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("google");
        /*
        for (int i = sb.length(); i > 0; i--) {
            System.out.print(sb.substring(i-1,i));
        }
        */
        System.out.println(sb.reverse());
    }
}
