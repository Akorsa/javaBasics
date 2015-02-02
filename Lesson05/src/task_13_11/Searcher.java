package task_13_11;

import java.util.ArrayList;

/**
 * This class can find substring, specified in searchString,
 * in first name, last name and partonymic fields of Employee instances in ArrayList<Employee>
 * and print matching info into console
 */

public class Searcher {

    public static void getNames(ArrayList<Employee> a, String searchString) {
        // for each item in ArrayList:
        for (Employee item : a) {
            if (searchString != null && !searchString.equals("") &&
                    (item.getFirstName().toLowerCase().contains(searchString.toLowerCase()) ||
                    item.getSecondName().toLowerCase().contains(searchString.toLowerCase()) ||
                    item.getPatronymic().toLowerCase().contains(searchString.toLowerCase()))) {
                System.out.printf("%s %s %s\n",
                        item.getSecondName(),
                        item.getFirstName(),
                        item.getPatronymic());
            }
        }
    }

    public static void getMoreThanNYearsOfWork(ArrayList<Employee> a, int N) {
        for (Employee item : a) {
            if (item.getYearsOfWork() >= N) {
                System.out.printf("%s %s %s\n%s\n\n",
                        item.getSecondName(),
                        item.getFirstName(),
                        item.getPatronymic(),
                        item.getAddress());
            }
        }
    }

}
