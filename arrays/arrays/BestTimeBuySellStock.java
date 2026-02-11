class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // update cheapest buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // profit if we sell today
            int profit = prices[i] - minPrice;

            // update best profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
