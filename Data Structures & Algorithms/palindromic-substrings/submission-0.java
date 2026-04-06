class Solution {
    public int countSubstrings(String s) {
        if (s.length() <=1) return 1;
        int resLen = 0;
        int count = 0;
        String result = "";
        int n = s.length();
        for (int i = 0 ; i< n ; i++) {
            // odd case 
            int l= i, r = i;
            while ( l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                /*int sz = r - l +1;
                if (sz > resLen) {
                    resLen = sz;
                    result = s.substring(l, r+1);
                }*/
                count ++;
                l -- ;
                r ++;
            }

            //even case
            l = i ; r = i + 1;
            while ( l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                /*int sz = r - l +1;
                if (sz > resLen) {
                    resLen = sz;
                    result = s.substring(l, r+1);
                }*/
                count ++;
                l -- ;
                r ++;
            }
        }
        
        return count;
    }
}
