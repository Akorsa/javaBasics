/**
 * Created by Yezhov Sergey on 07.11.2014.
 *
 */
public class Task_12_63 {
    public static void main(String[] args) {
        int[][] pupils = {
                {20, 20, 30, 30},    // 1 class
                {20, 20, 30, 30},    // 2 class
                {20, 20, 30, 30},
                {20, 20, 30, 30},
                {20, 20, 20, 20},
                {20, 20, 20, 20},
                {20, 20, 20, 20},
                {20, 20, 20, 20},
                {20, 20, 40, 40},
                {20, 20, 20, 20},
                {20, 20, 20, 20}  }; // 11 class

        int[] avrPupils = new int[pupils.length];

        for (int i = 0; i <= (pupils.length-1); i++) {
            for (int j = 0; j <= (pupils[i].length-1); j++) {
                avrPupils[i] += pupils[i][j];
            }
            avrPupils[i] = avrPupils[i]/pupils[i].length;
        }

        for (int avr : avrPupils) {
            System.out.println(avr);
        }
    }
}
