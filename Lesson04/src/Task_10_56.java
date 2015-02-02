
public class Task_10_56 {
    public static  void main(String[] args ) {
        int number = 109;

        if (number < 0) {
            System.out.println("Number is not natural");
            return;
        }

        if (number == 0) {
            System.out.println("The number is zero");
            return;
        }

        System.out.println("Is number " + number + " prime?\n" + checkNumber(number));
    }

    public static boolean checkNumber (int target) {
        return target == 0 || target == 1 || checkNumber(target - 1, target);
    }

    private static boolean checkNumber (int i, int target) {
        return i == 1 || (target % i != 0) && checkNumber(i - 1, target);
    }
}
