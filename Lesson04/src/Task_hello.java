/**
 * Created by Yezhov Sergey on 06.11.2014.
 *
 */

public class Task_hello {
    public static void main(String[] args) {
        hi("Юзернейм");
    }

    private static void hi(String name) {
        System.out.printf("Привет, %s!\n", name );
    }
}
