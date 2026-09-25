public class Question5 {
    private final double[] prices;
    private int count;
    private final String cartId;

    public Question5(String cartId, int maxItems) {
        this.cartId = cartId;
        prices = new double[maxItems];
        count = 0;
    }

    public void addItem(double price) {
        if (count < prices.length) {
            prices[count] = price;
            count++;
        }
    }

    public double getTotal() {
        double total = 0;

        for (int i = 0; i < count; i++) {
            total += prices[i];
        }

        return total;
    }

    public int getItemCount() {
        return count;
    }
}