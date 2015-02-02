/**
 * Created by Yezhov Sergey on 03.11.2014.
 *
 * Task 4.97: seasons
 *
 */
public class Task_4_97 {
    public static void main(String[] args) {
        char m = 11; // m = 1...12
        switch (m) {
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
                System.out.println("Winter");
                break;
        }
    }
}