/**
 * Created by Yezhov Sergey on 03.11.2014.
 *
 * Task 5.64: total area
 *
 */
public class Task_5_64 {
    public static void main(String[] args){
        double[] population = {9.5,   1,  10, 10, 10, 10, 10, 10, 10, 10, 10, 10}; // thousands of humans
        double[] density =    {1.5,   1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1}; // thousands of humans per km^2
        char err=0;

        double area=0;
        for (int i=1; i<=12; i++){

            if ((density[i-1]==0)||(population[i-1]==0)){
                System.out.println("Error: zero density/population in "+ i +" district");
                err = 1;
                break;
            }

            area+=population[i-1]/density[i-1];
        }

        if (err==0){
            System.out.printf("Total area: %,5.2f km^2\n",area);
        }
    }
}
