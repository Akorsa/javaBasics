/**
 * Created by Yezhov Sergey on 03.11.2014.
 *
 * Task 5.10: exchange rate table
 */
public class Task_5_10 {
    public static void main(String[] args) {
        double dollToRub = 42.24 ;
        for (int i=1; i<=20; i++) {
            System.out.printf("$%d = %,5.2f rub\n",i,i*dollToRub);
        }
    }
}