import java.util.Scanner;

/**
 * Created by Yezhov Sergey on 31.10.2014.
 *
 * Zlatopolsky: task 2.31
 * Swap 2nd and 3rd digits of 3-digit number.
 *
 */
public class Task_2_31 {
    public static void main(String[] args){
        try {
            //Using scanner for input
            Scanner in = new Scanner(System.in);

            System.out.println("\nSwap 2nd and 3rd digits of 3-digit number.\n");

            //Entering data
            System.out.print("Enter a number: ");

            // Loop for entering 3-digit number only
            boolean flag = true;
            while (flag) {
                //Analysis of input
                String input = in.nextLine(); //put the entered symbols into "input" string
                Scanner sc = new Scanner(input); //scan the "input"
                if (sc.hasNextInt()) {
                    int n = sc.nextInt();
                    if (n>99 && n<1000 && !sc.hasNext()) {
                        //Swap 2nd and 3rd digits
                        System.out.println("Result is: " + n/100 +""+ n%10 +""+ (n/10)%10);
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
