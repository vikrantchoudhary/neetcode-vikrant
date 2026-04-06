class Solution {
    int [] bill;
    public int minCostClimbingStairs(int[] cost) {
        bill = new int [cost.length];
        Arrays.fill(bill,-1);
        return Math.min(dfs(cost,1), dfs(cost,0));
    }
    private int dfs(int[] cost , int i){
        if ( i >= cost.length) return 0;
        if (bill[i] != -1) return bill[i];
        bill[i] = cost[i] + Math.min(dfs(cost,i+1), dfs(cost,i+2));
        return bill[i];
    }
}
