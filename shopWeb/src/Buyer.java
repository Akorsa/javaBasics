public class Buyer {

    private final String[] TYPE = {"Kid","Woman","Man"};
    private final int BUYS_MIN = 1;
    private final int BUYS_MAX = 50;

    private String type;
    private int amountOfBuys;

    public Buyer() {
        type = TYPE[(int) (2.9 * Math.random())];
        amountOfBuys = BUYS_MIN + (int) (BUYS_MAX * Math.random());
    }

    public String getType() {
        return type;
    }

    public void setAmountOfBuys(int amountOfBuys) {
        this.amountOfBuys = amountOfBuys;
    }

    public int getAmountOfBuys() {
        return amountOfBuys;
    }
}
