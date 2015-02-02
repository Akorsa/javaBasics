public class Checkout {

    private final int CHECKOUT_PERFORMANCE_MIN = 1;
    private final int CHECKOUT_PERFORMANCE_MAX = 10;

    // buys per step
    private int performance;

    public Checkout() {
        performance = CHECKOUT_PERFORMANCE_MIN + (int) (CHECKOUT_PERFORMANCE_MAX * Math.random());
    }

    public int getPerformance() {
        return performance;
    }

}
