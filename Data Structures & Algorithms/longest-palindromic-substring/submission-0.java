class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        int n = s.length();
        int resLen = 0;
        String result = "";
        for (int i = 0 ; i< n ; i++) {
            // odd case;
            int l = i , r =i;
            while ( l >=0 && r < n && s.charAt(l) == s.charAt(r)) {
                int len = r - l +1;
                if (resLen <= len){
                    resLen = len;
                    result = s.substring(l,r+1);
                }
                l--;
                r++;
            }
            //even case 
            l = i;
            r = i +1;
            while ( l >=0 && r < n && s.charAt(l) == s.charAt(r)) {
                int len = r - l +1;
                if (resLen <= len){
                    resLen = len;
                    result = s.substring(l,r+1);
                }
                l--;
                r++;
            }
        }
        return result;
    }
}
