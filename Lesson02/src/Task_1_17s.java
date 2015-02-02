import java.util.Scanner;
import static java.lang.Math.*;

/**
 * Created by Yezhov Sergey on 01.11.2014.
 *
 * Zlatopolsky: task 1.17 (s)
 */

public class Task_1_17s {
    public static void main(String[] args){
        try {
            //Using scanner for input
            Scanner in = new Scanner(System.in);

            System.out.println("\nCalculating the expression: abs(x)+abs(x+1).\n");

            //Entering data
            System.out.print("Enter x: ");
            double x = in.nextDouble();

            //Close the scanner
            in.close();

            //Calc the result
            double result = abs(x)+abs(x+1);
            System.out.println("Result is: "+result);
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
