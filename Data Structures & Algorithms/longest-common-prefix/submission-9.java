class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 0 )return null;
        char sol[] = strs[0].toCharArray();
        if (strs.length == 1) return new String(sol);
        int j = sol.length;
        for (int i = 1; i< strs.length;i++) {
            char cur[] = strs[i].toCharArray();
            int k = 0;
            while ( k < j && k < strs[i].length() && sol[k] == cur[k]) k++;
            j = k;
        }
        
        return new String(sol, 0, j);
    }
}