package org.example.chapter.array;

public class BestTimetoBuyandSellStockII {

    public static void maxProfit() {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    private static int maxProfit(int[] prices) {
        int profit = 0;
        if (prices.length == 0 || prices.length == 1) {
            return profit;
        }
        int buyValue = 0;
        int sellValue = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buyValue == 0 && prices[i] > prices[i - 1]) {
                buyValue = prices[i - 1];
                continue;
            }
        }
        return profit;
    }
}
