class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        Map<Integer,Integer> countMap = new HashMap<>();
        for (int num : hand) {
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        }
        Arrays.sort(hand);
        for (int n : hand) {
            if (countMap.get(n) > 0) {
            for (int i = n;i<n+groupSize;i++) {
                //if (!countMap.containsKey(i))return false;
                if (countMap.getOrDefault(i,0) == 0) {
                    //countMap.remove(i);
                    return false;
                }
                countMap.put(i,countMap.get(i)-1);
            }
        }
        }
        return true;

    }
}
