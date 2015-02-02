/**
 * Created by Yezhov Sergey on 06.11.2014.
 *
 */

public class Task_12_24 {
    public static void main(String[] args) {

        System.out.println("a)");
        int[][] arA = new int[6][6];
        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                if ( !((i == 0) || (j == 0)) ){
                    arA[i][j] = arA[i][j-1] + arA[i-1][j];
                }
                else {
                    arA[i][j] = 1;
                }
                System.out.print(arA[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\nb)");
        int[][] arB = new int[6][6];
        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                arB[i][j] = (i+j)%6 + 1;
                System.out.print(arB[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
