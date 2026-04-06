class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> hs = new HashSet<>();
        int maxSize = 0;
        int l = 0;
        for (int r = 0; r < s.length();r++) {
            while (hs.contains(s.charAt(r))) {
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(r));
            maxSize = Math.max(maxSize, hs.size());
        }
        return maxSize;
    }
}
