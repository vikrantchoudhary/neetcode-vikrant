class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int result[] = new int [queries.length];
        int i = 0;
        for (int q : queries) {
            int cur = -1;
            for (int [] inter : intervals) {
                int l = inter[0],r = inter[1];
                if (q >= l && q <= r) {
                    if (cur == -1 || cur > (r - l +1)) cur = r - l +1;
                }
            }
            result[i++] = cur;
        }
        return result;
    }
}
