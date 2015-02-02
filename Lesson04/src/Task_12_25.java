/**
 * Created by Yezhov Sergey on 06.11.2014.
 *
 */

public class Task_12_25 {
    public static void main(String[] args) {

        System.out.println("a)");
        int[][] arA = new int[12][10];
        int countA=0;
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                arA[i][j] = ++countA;
                System.out.print(arA[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\nb)");
        int[][] arB = new int[12][10];
        int countB=0;
        for (int j=0; j<10; j++) {
            for (int i=0; i<12; i++) {
                arB[i][j] = ++countB;
            }
        }
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arB[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\nv)");
        int[][] arV = new int[12][10];
        int countV=0;
        for (int i=0; i<12; i++) {
            for (int j=9; j>=0; j--) {
                arV[i][j] = ++countV;
            }
        }
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arV[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\ng)");
        int[][] arG = new int[12][10];
        int countG=0;
        for (int j=0; j<10; j++) {
            for (int i=11; i>=0; i--) {
                arG[i][j] = ++countG;
            }
        }
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arG[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\nd)");
        int[][] arD = new int[10][12];
        int countD=0;
        for (int i=0; i<10; i++) {
            if (i%2==0) {
                for (int j=0; j<12; j++) {
                    arD[i][j] = ++countD;
                }
            }
            else {
                for (int j=11; j>=0; j--) {
                    arD[i][j] = ++countD;
                }
            }
        }
        for (int i=0; i<10; i++) {
            for (int j=0; j<12; j++) {
                System.out.print(arD[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\ne)");
        int[][] arE = new int[12][10];
        int countE=0;
        for (int j=0; j<10; j++) {
            if (j%2==0) {
                for (int i=0; i<12; i++) {
                    arE[i][j] = ++countE;
                }
            }
            else {
                for (int i=11; i>=0; i--) {
                    arE[i][j] = ++countE;
                }
            }
        }
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arE[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\nzh)");
        int[][] arZH = new int[12][10];
        int countZH=0;
        for (int i=11; i>=0; i--) {
                for (int j=0; j<10; j++) {
                    arZH[i][j] = ++countZH;
                }
        }
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arZH[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\nz)");
        int[][] arZ = new int[12][10];
        int countZ=0;
        for (int j=9; j>=0; j--) {
            for (int i=0; i<12; i++) {
                arZ[i][j] = ++countZ;
            }
        }
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arZ[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\ni)");
        int[][] arI = new int[12][10];
        int countI=0;
        for (int i=11; i>=0; i--) {
            for (int j=9; j>=0; j--) {
                arI[i][j] = ++countI;
            }
        }
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arI[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\nk)");
        int[][] arK = new int[12][10];
        int countK=0;
        for (int j=9; j>=0; j--) {
            for (int i=11; i>=0; i--) {
                arK[i][j] = ++countK;
            }
        }
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arK[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\nl)");
        int[][] arL = new int[12][10];
        int countL=0;
        for (int i=11; i>=0; i--) {
            if (i%2==0) {
                for (int j=9; j>=0; j--) {
                    arL[i][j] = ++countL;
                }
            }
            else {
                for (int j=0; j<10; j++) {
                    arL[i][j] = ++countL;
                }
            }
        }
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arL[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\nm)");
        int[][] arM = new int[12][10];
        int countM=0;
        for (int i=0; i<12; i++) {
            if ( i%2==0 ) {
                for (int j=9; j>=0; j--) {
                    arM[i][j] = ++countM;
                }
            }
            else {
                for (int j=0; j<10; j++) {
                    arM[i][j] = ++countM;
                }
            }
        }
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arM[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\nn)");
        int[][] arN = new int[12][10];
        int countN=0;
        for (int j=9; j>=0; j--) {
            if ( !(j%2==0) ) {
                for (int i=0; i<12; i++) {
                    arN[i][j] = ++countN;
                }
            }
            else {
                for (int i=11; i>=0; i--) {
                    arN[i][j] = ++countN;
                }
            }
        }
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arN[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\no)");
        int[][] arO = new int[12][10];
        int countO=0;
        for (int j=0; j<10; j++) {
            if ( !(j%2==0) ) {
                for (int i=0; i<12; i++) {
                    arO[i][j] = ++countO;
                }
            }
            else {
                for (int i=11; i>=0; i--) {
                    arO[i][j] = ++countO;
                }
            }
        }
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arO[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\np)");
        int[][] arP = new int[12][10];
        int countP=0;
        for (int i=11; i>=0; i--) {
            if ( !(i%2==0) ) {
                for (int j=9; j>=0; j--) {
                    arP[i][j] = ++countP;
                }
            }
            else {
                for (int j=0; j<10; j++) {
                    arP[i][j] = ++countP;
                }
            }
        }
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arP[i][j] + "   ");
            }
            System.out.println();
        }





        System.out.println("\nr)");
        int[][] arR = new int[12][10];
        int countR=0;
        for (int j=9; j>=0; j--) {
            if ( !(j%2==0) ) {
                for (int i=11; i>=0; i--) {
                    arR[i][j] = ++countR;
                }
            }
            else {
                for (int i=0; i<12; i++) {
                    arR[i][j] = ++countR;
                }
            }
        }
        for (int i=0; i<12; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arR[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
