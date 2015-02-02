
public class Task_10_55 {
    public static void main(String[] args) {
        int number = 250;
        int N = 16; // radix = 2...16

        if (N < 2 && N > 16) {
            System.out.println("Radix is out of bounds");
            return;
        }
        if (number < 0) {
            System.out.println("Number is not natural");
            return;
        }
        if (number == 0) {
            System.out.println("0");
            return;
        }
        System.out.println(trans(number, N));
    }

    public static String trans(int num, int N) {
        if (num == 0) {
            return "";
        }

        String str;
        switch (num % N) {
            case 10:
                str = "A";
                break;
            case 11:
                str = "B";
                break;
            case 12:
                str = "C";
                break;
            case 13:
                str = "D";
                break;
            case 14:
                str = "E";
                break;
            case 15:
                str = "F";
                break;
            default:
                str = String.valueOf(num % N);
        }
        return trans(num/N, N) + str;
    }
}
