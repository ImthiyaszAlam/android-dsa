public class BuyAndSellStock {

    public static int maxProfit(int stocks[]) {

        int maxProfit = 0;

        for (int i = 0; i < stocks.length; i++) {

            for (int j = i + 1; j < stocks.length; j++) {
                int profit = stocks[j] - stocks[i];

                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int stocks[] = { 7, 1, 5, 3, 6, 4 };
        int profit = maxProfit(stocks);

        System.out.print(profit);

    }
}
