/**
 * Created by Yezhov Sergey on 06.11.2014.
 *
 */
public class Task_12_23 {
    public static void main(String[] args) {

        System.out.println("a)");
        int[][] arA = new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == j) || (i == 6 - j)) {
                    arA[i][j] = 1;
                }
                System.out.print(arA[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nb)");
        int[][] arB = new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == j) || (i == 6 - j) || (i == 3) || (j == 3)) {
                    arB[i][j] = 1;
                }
                System.out.print(arB[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nv)");
        int[][] arV = new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if ( (i == j) || (i == 6-j) || (j==3) || ((i==0 || i==1 || i==5 || i==6)&&((j==2)||(j==4))) || ((i==0)||(i==6)) && ((j==1)||(j==5)) ) {
                    arV[i][j] = 1;
                }
                System.out.print(arV[i][j] + " ");
            }
            System.out.println();
        }

    }
}
