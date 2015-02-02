/**
 * Created by Yezhov Sergey on 03.11.2014.
 *
 * Task 4.35: pedestrian traffic lights
 */
public class Task_4_35 {
    public static void main(String[] args) {
        char t = 42; // t = 0...59
        if (t%5>=0 && t%5<=2) {
            System.out.println("Green");
        }
        else {
            System.out.println("Red");
        }
    }
}