/**
 * Created by Yezhov Sergey on 06.11.2014.
 *
 * Task 9.17: 1st symbol equals last one
 *
 */
public class Task_9_17 {
    public static void main(String[] args) {
        try {
            String str = "tat";
            System.out.println(str.charAt(0)==str.charAt(str.length() - 1));
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
