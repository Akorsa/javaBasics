import java.util.Scanner;

/**
 * Created by fightlight on 29.10.2014.
 * Task 1.3 from Zlatopolsky
 */
public class HelloWorld {
    public static void main(String[] args){
        //System.out.println("Hello world!");
        //Using scanner for input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = in.nextInt();
        //Output
        System.out.println("You entered a number: "+num);
        //Close scanner "in"
        in.close();
    }
}
