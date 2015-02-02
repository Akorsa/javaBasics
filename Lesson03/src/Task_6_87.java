import java.util.Scanner;

/**
 * Created by Yezhov Sergey on 03.11.2014.
 *
 * Task 6.87: basketball
 *
 */
public class Task_6_87 {
    public static void main(String[] args){
        try {
            Scanner in = new Scanner(System.in);
            int firstTeamScore=0;
            int secondTeamScore=0;
            int currScore;
            int teamNumber;

            while(true) {
                System.out.print("Enter score (1/2/3): ");
                currScore = in.nextInt();

                if (currScore == 0) {
                    if (firstTeamScore==secondTeamScore){
                        System.out.println("*** There is no such a thing as draw in basketball! ***\n");
                        continue;
                    }
                    break; // game over
                }
                else if ((currScore<1) || (currScore>3)){
                    System.out.println("*** Wrong score! ***\n");
                    continue;
                }

                System.out.print("Enter team number (1/2): ");
                teamNumber = in.nextInt();

                if (teamNumber==1){
                    firstTeamScore+=currScore;
                }
                else if (teamNumber==2){
                    secondTeamScore+=currScore;
                }
                else{
                    System.out.println("*** Wrong team number! ***\n");
                    continue;
                }
                System.out.printf("Current score %d : %d\n\n",firstTeamScore,secondTeamScore);
            }

            System.out.printf("\nTotal score %d : %d\n",firstTeamScore,secondTeamScore);

            if (firstTeamScore>secondTeamScore){
                System.out.println("The winner is 1st team");
            }
            else if (firstTeamScore<secondTeamScore){
                System.out.println("The winner is 2nd team");
            }
        }
        catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
}