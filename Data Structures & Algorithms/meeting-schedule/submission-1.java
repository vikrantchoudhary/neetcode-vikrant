/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        //boolean result ;
        Interval prev = new Interval(0,0);
        
        Collections.sort(intervals,Comparator.comparingInt(a -> a.start));
        for (Interval inter : intervals) {
            if (inter.start < prev.end) return false;
            prev = inter;
        }
        return true;
    }
}
