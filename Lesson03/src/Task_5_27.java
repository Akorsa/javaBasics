/**
 * Created by Yezhov Sergey on 03.11.2014.
 *
 * Task 5.27: sum
 *
 */
public class Task_5_27 {
    public static void main(String[] args) {
        int sumA=0;
        int sumB=0;
        int sumV=0;
        int sumG=0;

        // a)
        for (int i=100; i<=500; i++) {
            sumA+=i;
        }

        // b)
        int a = 42; // a <= 500
        for (int i=a; i<=500; i++) {
            sumB+=i;
        }

        // v)
        int b = 11; // b >= -10
        for (int i=-10; i<=b; i++) {
            sumV+=i;
        }

        // g)
        int aa = -42; //
        int bb = 42; // bb >= aa
        for (int i=aa; i<=bb; i++) {
            sumG+=i;
        }

        System.out.printf(" a) %d \n b) %d \n v) %d \n g) %d \n ",sumA,sumB,sumV,sumG);
    }
}