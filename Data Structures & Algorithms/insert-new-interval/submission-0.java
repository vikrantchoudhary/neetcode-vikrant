class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length <= 0 )return new int[][] {{newInterval[0],newInterval[1]}};
        int n = intervals.length;
        List<int[]> output = new ArrayList<>();
        int i = 0;
        while (i < n && intervals[i][1] < newInterval[0]) {
            output.add(intervals[i]);
            i++;
        }
        while (i<n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        output.add(newInterval);
        while (i < n ) {
            output.add(intervals[i]);
            i++;
        }
        return output.toArray(new int[output.size()][]);

        
    }
}
