class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        return intervals.length - dfs(intervals,0,-1);
    }
    private int dfs(int[][] intervals,int cur, int prev) {
        if (cur == intervals.length) return 0;
        int res = dfs(intervals,cur + 1 , prev);
        if (prev == -1 || intervals[prev][1] <= intervals[cur][0]) {
            res = Math.max(res,1+dfs(intervals,cur+1,cur));
        }
        return res;
    }
}
