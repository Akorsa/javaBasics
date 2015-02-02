public class Task_bits {

    public static void main(String[] args) {

        // A) 2 to the power of <n>
        methodA(31); // number = 0...31

        // B) (2 to the power of <n>) plus (2 to the power of <m>) where n != m
        methodB(2, 1); //n != m, n|m = 0...31

        // C) Clear last <i> bit(-s) in number
        methodC(0xF, 2); // 2nd parameter = 0...32

        // D) Set i(-th) bit in number
        methodD(0x8, 0); // 2nd parameter = 0...31

        // E) Invert i(-th) bit in number
        methodE(0xB, 0); // 2nd parameter = 0...31

        // F) Clear i(-th) bit in number
        methodF(0xF, 0); // 2nd parameter = 0...31

        // G) Clear all bits in number except last <i>
        methodG(0xF, 1); // 2nd parameter = 0...32

        // H) Print i(-th) bit of number
        methodH(0x8, 0); // 2nd parameter = 0...31

        // I) Print <byte> number in binary format
        methodI((byte) 0xFC);

    }


    private static void methodA(int n) {
        if (checkNum(n, 0, 31)) {
            System.out.printf("A) 2 to the power of %d:\n0x%X\n\n",
                    n,
                    1 << n);
        } else {
            System.out.println("A) Input data error\n");
        }
    }


    private static void methodB(int n, int m) {
        if (  checkNum(n, 0, 31) && checkNum(m, 0, 31) && (n != m)  ) {
        System.out.printf("B) (2 to the power of %d) plus (2 to the power of %d):\n0x%X\n\n",
                n, m,
                (1 << n) | (1 << m));
        } else {
            System.out.println("B) Input data error\n");
        }
    }


    private static void methodC(int A, int i) {
        if (checkNum(i, 0, 32)) {
            System.out.printf( "C) Clear last %d bit(-s) in number 0x%X:\n0x%X\n\n",
                i, A,
                (i == 32) ? 0 : (0xFFFFFFFF << i) & A );
        } else {
            System.out.println("C) Input data error\n");
        }
    }


    private static void methodD(int A, int i) {
        if (checkNum(i, 0, 31)) {
            System.out.printf("D) Set %d(-th) bit in number 0x%X:\n0x%X\n\n",
                    i, A,
                    (1 << i) | A);
        } else {
            System.out.println("D) Input data error\n");
        }
    }


    private static void methodE(int A, int i) {
        if (checkNum(i, 0, 31)) {
            System.out.printf("E) Invert %d(-th) bit in number 0x%X:\n0x%X\n\n",
                    i, A,
                    (1 << i) ^ A);
        } else {
            System.out.println("E) Input data error\n");
        }
    }


    private static void methodF(int A, int i) {
        if (checkNum(i, 0, 31)) {
            System.out.printf("F) Clear %d(-th) bit in number 0x%X:\n0x%X\n\n",
                i, A,
                ~(1 << i) & A);
        } else {
            System.out.println("F) Input data error\n");
        }
    }


    private static void methodG(int A, int n) {
        if (checkNum(n, 0, 32)) {
            System.out.printf("G) Clear all bits in number 0x%X except last %d:\n0x%X\n\n",
                A, n,
                (n == 32) ? A : ~(0xFFFFFFFF << n) & A );
        } else {
            System.out.println("G) Input data error\n");
        }
    }


    private static void methodH(int A, int i) {
        if (checkNum(i, 0, 31)) {
            System.out.printf("H) Print %d(-th) bit of number 0x%X:\n%d\n\n",
                i, A,
                ((1 << i) & A) >> i );
        } else {
            System.out.println("H) Input data error\n");
        }
    }


    private static void methodI(byte number) {
        StringBuilder sb = new StringBuilder("");
        for (int i=7; i>=0; i--) {
            sb.append(   Integer.toString(((1 << i) & number) >> i)   );
        }
        System.out.printf("I) Print <byte> number 0x%X in binary format:\n0x%s\n\n", number,
                sb);
    }


    private static boolean checkNum(int num, int low, int high) {
        return num >= low && num <= high;
    }
}
