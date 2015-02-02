import java.util.LinkedList;
import java.util.Scanner;

public class EMart {
    public static void main(String[] args) {
        // enter number of checkouts
        int numberOfCheckouts = 10;

        // enter number of steps
        int steps = 20;


        // checkouts list
        Checkout[] checkouts = new Checkout[numberOfCheckouts];
        for (int i=0; i < numberOfCheckouts; i++) {
            checkouts[i] = new Checkout();
        }

        // buyers list
//        LinkedList buyers Queue: .add .remove .peek (retrieves the Head)
        LinkedList<Buyer>[] buyersQueues = new LinkedList[numberOfCheckouts];
        for (int i = 0; i < buyersQueues.length; i++) {
            buyersQueues[i] = new LinkedList<>();
        }

        // create new buyer
        Buyer newBuyer = new Buyer();
        printQueues(newBuyer, checkouts, buyersQueues);

        // iterate through steps
        Scanner in = new Scanner(System.in);
        System.out.println("\nPress <Enter> to continue");
        in.nextLine();
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        for (int step = 0; step < steps; step++) {

            // new buyer chooses a checkout
            selectACheckout(newBuyer, buyersQueues, checkouts);

            // print the selection of the queue
//            printQueues(null, checkouts, buyersQueues);
//            System.out.println("\nPress <Enter> to continue");
//            in.nextLine();
//            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            // serve the first buyer in the queue
            for (int i = 0; i < buyersQueues.length; i++) {
                // buys--
                Buyer head = buyersQueues[i].peek();
                if (head != null) {
                    head.setAmountOfBuys(head.getAmountOfBuys() - checkouts[i].getPerformance());
                    if (head.getAmountOfBuys() <= 0) buyersQueues[i].remove();
                }
            }

            // finalize step
            System.out.println("\nStep " + (step + 1));
            newBuyer = new Buyer();
            printQueues(newBuyer, checkouts, buyersQueues);
            System.out.println("\nPress <Enter> to continue");
            in.nextLine();
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }

    private static void printQueues(Buyer newBuyer, Checkout[] checkouts, LinkedList<Buyer>[] buyersQueues) {
        if (newBuyer != null) {
            System.out.printf("\nNew buyer: %s with %d buys\n\n", newBuyer.getType(), newBuyer.getAmountOfBuys());
        } else {
            System.out.println("\nNew buyer: >>>\n");
        }
        for (int i = 0; i < checkouts.length; i++) {
            StringBuilder queue = new StringBuilder();
            if (buyersQueues[i] != null) {
                for (Buyer buyer : buyersQueues[i]) {
                    queue.append(buyer.getType());
                    queue.append(" ");
                    queue.append(buyer.getAmountOfBuys());
                    queue.append(", ");
                }
            }

            System.out.printf("Checkout #%d (%d buyers per step) <<< %s\n", i + 1, checkouts[i].getPerformance(), queue);
        }
    }

    private static void selectACheckout(Buyer newBuyer, LinkedList<Buyer>[] buyersQueues, Checkout[] checkouts) {
        switch (newBuyer.getType()) {
            case "Kid":
                buyersQueues[(int)((buyersQueues.length - 1) * Math.random())].add(newBuyer);
                break;
            case "Woman":
                int minQueueIndex = 0;
                for (int i = 0; i < buyersQueues.length; i++) {
                    if (buyersQueues[minQueueIndex].size() > buyersQueues[i].size()) {
                        minQueueIndex = i;
                    }
                }
                buyersQueues[minQueueIndex].add(newBuyer);
                break;
            case "Man":
                int optQueueIndex = 0;
                int optSteps = 0;

                // calc number of steps in the first queue
                for (Buyer buyer : buyersQueues[0]) {
                    optSteps += numberOfSteps(buyer, checkouts[0]);
                }
                // + number of steps for the newBuyer
                optSteps += numberOfSteps(newBuyer, checkouts[0]);

                // calc number of steps in the other queues and compare with the first one
                for (int i = 0; i < buyersQueues.length; i++) {
                    int queueSteps = 0;
                    for (Buyer buyer : buyersQueues[i]) {
                        queueSteps += numberOfSteps(buyer, checkouts[i]);
                    }
                    queueSteps += numberOfSteps(newBuyer, checkouts[i]);
                    if (queueSteps < optSteps) {
                        optSteps = queueSteps;
                        optQueueIndex = i;
                    }
                }
                buyersQueues[optQueueIndex].add(newBuyer);
                break;
        }
    }

    private static int numberOfSteps(Buyer buyer, Checkout checkout) {
        return (buyer.getAmountOfBuys() % checkout.getPerformance() > 0) ?
                buyer.getAmountOfBuys() / checkout.getPerformance() + 1 :
                buyer.getAmountOfBuys() / checkout.getPerformance();
    }
}
