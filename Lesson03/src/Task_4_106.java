/**
 * Created by Yezhov Sergey on 03.11.2014.
 *
 * Task 4.106: Japan calendar
 *
 */
public class Task_4_106 {
    public static void main(String[] args){

        int year=1917; // year >= 0

        int knownYear=1984; //green rat
        int tst;

        String color="";
        String yearName="";

        if (year>=knownYear){ // a) year >= 1984
            tst=year-knownYear;
        }
        else{ // b) year - unsigned integer
            tst=60-(knownYear-year)%60;
        }

        switch (((tst/12)%5)){
            case 0:
                color="Green";
                break;
            case 1:
                color="Red";
                break;
            case 2:
                color="Yellow";
                break;
            case 3:
                color="White";
                break;
            case 4:
                color="Black";
                break;
        }

        switch (tst%12){
            case 0:
                yearName="Rat";
                break;
            case 1:
                yearName="Cow";
                break;
            case 2:
                yearName="Tiger";
                break;
            case 3:
                yearName="Hare";
                break;
            case 4:
                yearName="Dragon";
                break;
            case 5:
                yearName="Snake";
                break;
            case 6:
                yearName="Horse";
                break;
            case 7:
                yearName="Sheep";
                break;
            case 8:
                yearName="Monkey";
                break;
            case 9:
                yearName="Chicken";
                break;
            case 10:
                yearName="Dog";
                break;
            case 11:
                yearName="Pig";
                break;
        }
        System.out.println(color+" "+yearName);
    }
}