import java.util.Scanner;

/**
 * Created by Yezhov Sergey on 31.10.2014.
 *
 * Zlatopolsky: task 2.39 (Clock: hour hand angle.)
 *
 */
public class Task_2_39 {
    public static void main(String[] args) {
        try {
            // Variables
            int h=0, m=0, s=0;
            boolean flag=true;
            final String enterHours="Enter hours (24 format): ";
            final String enterMinutes="Enter minutes: ";
            final String enterSeconds="Enter seconds: ";

            System.out.println("\nClock: hour hand angle.\n");

            // Scanner for input
            Scanner in = new Scanner(System.in);


            // Entering hours
            System.out.print(enterHours);
            while (flag) {
                // Analysis of input
                String input = in.nextLine(); // put the entered symbols into "input" string
                Scanner sc = new Scanner(input); // scan the "input"
                if (sc.hasNextInt()) {
                    h = sc.nextInt();
                    if (!sc.hasNext() && h >= 0 && h <= 23) {
                        // exit loop
                        flag = false;
                    } else {
                        // Wrong input. Repeat the loop
                        System.out.print(enterHours);
                    }
                } else {
                    // Wrong input. Repeat the loop
                    System.out.print(enterHours);
                }
                // Close "sc" scanner
                sc.close();
            }


            // Entering minutes
            flag=true;
            System.out.print(enterMinutes);
            while (flag) {
                // Analysis of input
                String input = in.nextLine(); // put the entered symbols into "input" string
                Scanner sc = new Scanner(input); // scan the "input"
                if (sc.hasNextInt()) {
                    m = sc.nextInt();
                    if (!sc.hasNext() && m >= 0 && m <= 59) {
                        // exit loop
                        flag = false;
                    } else {
                        // Wrong input. Repeat the loop
                        System.out.print(enterMinutes);
                    }
                } else {
                    // Wrong input. Repeat the loop
                    System.out.print(enterMinutes);
                }
                // Close "sc" scanner
                sc.close();
            }


            // Entering seconds
            flag=true;
            System.out.print(enterSeconds);
            while (flag) {
                // Analysis of input
                String input = in.nextLine(); // put the entered symbols into "input" string
                Scanner sc = new Scanner(input); // scan the "input"
                if (sc.hasNextInt()) {
                    s = sc.nextInt();
                    if (!sc.hasNext() && s >= 0 && s <= 59) {
                        // exit loop
                        flag = false;
                    } else {
                        // Wrong input. Repeat the loop
                        System.out.print(enterSeconds);
                    }
                } else {
                    // Wrong input. Repeat the loop
                    System.out.print(enterSeconds);
                }
                // Close "sc" scanner
                sc.close();
            }

            // Close "in" scanner
            in.close();

            /*
            * 1 hour = 2*pi/12 = pi/6
            * 1 minute = 1 hour / 60 = pi/360
            * 1 second = 1 minute / 60 = pi/21600
            *
            * angle_radians = h*(pi/6) + m*(pi/360) + s*(pi/21600) = pi * (h/6 + m/360 + s/21600)
            *
            * angle_degrees = angle_radians*(180/pi) = 180*(h/6 + m/360 + s/21600)
            * */

             System.out.println("Angle in degrees: "+180*(h/6. + m/360. + s/21600.));
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
