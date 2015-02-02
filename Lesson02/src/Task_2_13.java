import java.util.Scanner;

/**
 * Created by Yezhov Sergey on 31.10.2014.
 *
 * Zlatopolsky: task 2.13
 * Inverting the sequence of digits of 3-digit number.
 *
 */
public class Task_2_13 {
    public static void main(String[] args){
        try {
            //Using scanner for input
            Scanner in = new Scanner(System.in);

            System.out.println("\nInverting the sequence of digits of 3-digit number. \n");

            //Entering data
            System.out.print("Enter a number: ");

            // Loop for entering 3-digit number only
            boolean flag = true;
            while (flag) {
                //Analysis of input
                String input = in.nextLine(); //put the entered symbols into "input" string
                Scanner sc = new Scanner(input); //scan the "input"
                if (sc.hasNextInt()) {
                    int x = sc.nextInt();
                    if (x>99 && x<1000 && !sc.hasNext()) {
                        //Inverting the the sequence of digits
                        System.out.println("Result is: " + x%10 +""+ (x/10)%10 +""+ x/100);
                        //exit loop
                        flag = false;
                    }
                    else {
                        //Wrong input. Repeat the loop
                        System.out.print("Enter a 3-digit number: ");
                    }
                }
                else {
                    //Wrong input. Repeat the loop
                    System.out.print("Enter a 3-digit number: ");
                }
                //Close "sc" scanner
                sc.close();

            }
            //Close "in" scanner
            in.close();
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
