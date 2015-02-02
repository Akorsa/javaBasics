import java.util.Scanner;
import static java.lang.Math.*;

/**
 * Created by Yezhov Sergey on 31.10.2014.
 *
 * Zlatopolsky: task 1.17 (r)
 */

public class Task_1_17r {
    public static void main(String[] args){
        try {
            //Using scanner for input
            Scanner in = new Scanner(System.in);

            System.out.println("\nCalculating the expression: (sqrt(x + 1) + sqrt(x-1)) / (2*sqrt(x)).\n");

            //Entering data
            System.out.print("Enter x: ");
            double x = in.nextDouble();

            //Close the scanner
            in.close();

            //Calc the result
            double result = (sqrt(x + 1) + sqrt(x-1)) / (2*sqrt(x));
            System.out.println("Result is: "+result);
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
