import java.util.Scanner;

/**
 * Created by Yezhov Sergey on 01.11.2014.
 *
 * Zlatopolsky: task 2.43
 */
public class Task_2_43 {
    public static void main(String[] args) {
        try {
            //Using scanner for input
            Scanner in = new Scanner(System.in);

            System.out.println("\nIf (a mod b) = 0 or (b mod a) = 0 then output -> 1, else output -> some number.\n");

            //Entering data
            System.out.print("Enter a: ");
            int a = in.nextInt();
            System.out.print("Enter b: ");
            int b = in.nextInt();

            //Close the scanner
            in.close();

            //Output
            //System.out.println("a mod b: "+a%b);
            //int result = (a%b) * (b%a) + 1;
            int result = (int)((a%(double)b) * (b%(double)a) + 1); //considering of if a or b equals 0.
            System.out.println("Result is: "+result);
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
