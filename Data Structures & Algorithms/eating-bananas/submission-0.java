class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if (piles.length < 1) return 0;
        //if (h < piles.length) return Integer.MAX_VALUE;
        int r = 0;
        for (int n : piles) {
            r = r >= n ? r: n;
        }
        int l = 1; 
        int result = r;
        while (l <= r) {
            int mid = (l+r)/2;
            long totalTime = 0;
            for (int n : piles){
                totalTime += Math.ceil((double)n/mid);
            }
            if (totalTime <= h) {
                result = mid;
                r = mid -1;
            }else {
                l = mid+1;
            }
            System.out.println(mid);
        }
        return result;

    }
}
