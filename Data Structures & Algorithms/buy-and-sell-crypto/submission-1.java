class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int maximumProfit = 0;
        int buy = prices[0];
        int sell = Integer.MIN_VALUE;

        for (int price : prices) {
            if (price - buy > maximumProfit) {
                maximumProfit = price - buy;
            }
            if (price < buy) {
                buy = price;
            }
        }

        return maximumProfit;
    }
}
