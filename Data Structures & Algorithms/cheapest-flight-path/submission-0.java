class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int [] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);
        prices[src] = 0;
        for (int i = 0 ; i <= k ; i++) {
            int tempArr[] = Arrays.copyOf(prices,n);
            for (int [] flight : flights) {
                int sc = flight[0],dt = flight[1],ct = flight[2];
                if (prices[sc] == Integer.MAX_VALUE) continue;
                int cost = prices[sc] + ct;
                if (cost < tempArr[dt]) {
                    tempArr[dt] = cost;
                }
            }
            prices = tempArr;
        }
        return prices[dst] == Integer.MAX_VALUE? -1: prices[dst];
    }
}
