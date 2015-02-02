
import static java.lang.Math.*;

/**
 * Created by Yezhov Sergey on 01.11.2014.
 *
 * Zlatopolsky: Task 3.29
 */
public class Task_3_29 {
    public static void main(String[] args) {
        int X = -5;
        int Y = 1;
        int Z = 121;

        System.out.println("X: "+X+"\nY: "+Y+"\nZ: "+Z+"\n");

        // a)
        System.out.println("a) Every of X and Y is odd");
        if ((abs(X%2)==1) & (abs(Y%2)==1)) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
        System.out.println();


        // b)
        System.out.println("b) Only one of X and Y is less than 20");
        if ((X<20)^(Y<20)) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
        System.out.println();


        // v)
        System.out.println("v) At least one of X and Y equals 0");
        if ((X==0)|(Y==0)) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
        System.out.println();


        // g)
        System.out.println("g) Every of X, Y and Z is negative");
        if ((X<0)&(Y<0)&(Z<0)) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
        System.out.println();


        // d)
        System.out.println("d) Only one of X, Y and Z multiple of 5");
        if (((abs(X%5)==0)^(abs(Y%5)==0)^(abs(Z%5)==0)) & !((abs(X%5)==0)&(abs(Y%5)==0)&(abs(Z%5)==0))) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
        System.out.println();


        // e)
        System.out.println("e) At least one of X, Y and Z is greater than 100");
        if ((X>100)|(Y>100)|(Z>100)) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
        System.out.println();
    }
}
