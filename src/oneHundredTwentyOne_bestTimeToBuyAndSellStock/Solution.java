package oneHundredTwentyOne_bestTimeToBuyAndSellStock;

public class Solution {

    public static int maxProfit(int[] prices) {
        int buyDate = 0;
        int sellDate = 1;
        int maxProfit = 0;

        while (sellDate < prices.length) {
            if (prices[buyDate] < prices[sellDate]) {
                maxProfit = Math.max(maxProfit, prices[sellDate] - prices[buyDate]);
            } else {
                buyDate = sellDate;
            }
            sellDate++;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
