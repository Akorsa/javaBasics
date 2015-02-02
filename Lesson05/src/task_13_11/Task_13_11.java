package task_13_11;

import java.util.ArrayList;

public class Task_13_11 {
    public static void main(String[] args) {

        // ArrayList of Employee type
        ArrayList<Employee> a = new ArrayList<>();

        // Fill ArrayList
        a.add(new Employee("Robbins","Tim","USA", 1994, 5));
        a.add(new Employee("Freeman","Morgan","USA", 1994, 2));
        a.add(new Employee("Gunton","Bob","USA", 1994, 3));
        a.add(new Employee("Sadler","William","USA", 1994, 5));
        a.add(new Employee("Brown","Clancy","USA", 1994, 5));
        a.add(new Employee("Wookiee","Chewbacca","Chewbacca","Kashyyyk", 1900, 5));
        a.add(new Employee("Bezrukov","Sergey","Vitalyevich","Russia", 2011, 12));

        // For each in "a" (print -> not less than 3 years of work)
        System.out.println("*** Years of work >= 3 ***");
        Searcher.getMoreThanNYearsOfWork(a, 3);
        System.out.println();

        // Using the class "searcher". Searching for "bro"...
        System.out.println("*** Searcher: \"bro\" ***");
        Searcher.getNames(a, "bro");
        System.out.println();

        // Searching for "k"...
        System.out.println("*** Searcher: \"K\" ***");
        Searcher.getNames(a, "K");
    }
}
