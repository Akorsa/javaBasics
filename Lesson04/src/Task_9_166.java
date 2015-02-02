/**
 * Created by Yezhov Sergey on 06.11.2014.
 *
 * Task 9.166: replace 1st and last words in the sentence.
 *
 */
public class Task_9_166 {
    public static void main(String[] args) {

        // input
        String str = "It is still your mfn set.";

        try {
            // main
            StringBuilder sb = new StringBuilder(str);
            String tmp = sb.substring(0, sb.indexOf(" "));
            sb.replace(0, sb.indexOf(" "), sb.substring(sb.lastIndexOf(" ") + 1, sb.indexOf(".")));
            sb.replace(sb.lastIndexOf(" ") + 1, sb.indexOf("."), tmp);
            System.out.println(sb);
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
