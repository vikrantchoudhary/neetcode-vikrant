class Solution {
    public int characterReplacement(String s, int k) {
        int [] charCount = new int[26];
        int result =0,maxCount =0 , start =0;
        for (int end = 0; end < s.length();end++) {
            char c = s.charAt(end);
            charCount[c - 'A']++;
            maxCount = Math.max(maxCount,charCount[c - 'A']);
            while ((end -start + 1 - maxCount) > k ) {
                charCount[s.charAt(start) - 'A'] --;
                start ++;
            }
            result = Math.max(result,end-start+1);
        }
        return result;
    }
}
