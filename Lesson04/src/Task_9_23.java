/**
 * Created by Yezhov Sergey on 06.11.2014.
 *
 * Task 9.23: substring from m to n symbol
 *
 */

public class Task_9_23 {
    public static void main(String[] args) {
        try {
            int m = 5;
            int n = 9;
            System.out.println("telescope".substring(m-1,n));
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
