
public class Task_12_28 {
    public static void main(String[] args) {

        // square matrix
        int[][] ar = new int[5][5];

        fourSidesLoop(ar);

        for (int[] subAr : ar) {
            for (int elem : subAr) {
                System.out.print(elem + "   ");
            }
            System.out.println();
        }
    }

    private static void fourSidesLoop(int[][] array) {

        int counter = 1;
        int matrixSize = array.length;

        // *** limit variables ***
        // top -> from left to right (i - const)
        int iLR = 0; // const
        int jLRFrom = 0; // from
        int jLRTo = matrixSize - 2; // to

        // left side -> from the top down (j - const)
        int jTD = matrixSize - 1; // const
        int iTDFrom = 0; // from
        int iTDTo = matrixSize - 2; // to

        // bottom -> from right to left (i - const)
        int iRL = matrixSize - 1; // const
        int jRLFrom = matrixSize - 1; // from
        int jRLTo = 1; // to

        // right side -> from the bottom up (j - const)
        int jBU = 0; // const
        int iBUFrom = matrixSize - 1; // from
        int iBUTo = 1; // to
        // ************

        while (iLR < matrixSize/2) {

            // top -> from left to right (i - const)
            for (int j = jLRFrom; j <= jLRTo; j++) {
                array[iLR][j] = counter++;
            }
            iLR++;
            jLRFrom++;
            jLRTo--;


            // left side -> from the top down (j - const)
            for (int i = iTDFrom; i <= iTDTo; i++) {
                array[i][jTD] = counter++;
            }
            jTD--;
            iTDFrom++;
            iTDTo--;

            // bottom -> from right to left (i - const)
            for (int j = jRLFrom; j >= jRLTo; j--) {
                array[iRL][j] = counter++;
            }
            iRL--;
            jRLFrom--;
            jRLTo++;

            // right side -> from the bottom up (j - const)
            for (int i = iBUFrom; i >= iBUTo; i--) {
                array[i][jBU] = counter++;
            }
            jBU++;
            iBUFrom--;
            iBUTo++;
        }
        if (matrixSize % 2 != 0) array[matrixSize / 2][matrixSize / 2] = counter;
    }
}
