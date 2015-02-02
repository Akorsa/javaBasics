/**
 * Created by Yezhov Sergey on 06.11.2014.
 *
 * Task 9.102: replace n and m symbols
 *
 */

public class Task_9_102 {
    public static void main(String[] args) {

        // input
        String str = "surround";
        int m = 4;
        int n = 1;

        try {
            // main
            StringBuilder sb = new StringBuilder(str);
            char tmp = sb.charAt(m-1);
            sb.setCharAt(m-1, sb.charAt(n-1));
            sb.setCharAt(n-1, tmp);
            System.out.println(sb);
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
