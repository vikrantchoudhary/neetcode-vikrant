class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currProfit = 0;
        int currentBuy = prices[0];
        for (int i= 1; i< prices.length;i++) {
            if (currentBuy < prices[i]) {
                currProfit = prices[i] - currentBuy;
            }else {
                currentBuy = prices[i];
            }
            maxProfit = Math.max(maxProfit, currProfit);
        }
        return maxProfit;
    }
}
