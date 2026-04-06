class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty() || s.length() < t.length()) return "";
        HashMap<Character,Integer> countT = new HashMap<>();
        for (char c : t.toCharArray()) {
            countT.put(c,countT.getOrDefault(c,0)+1);
        }
        int resLen = Integer.MAX_VALUE;
        int res[] = new int[] {-1,-1};
        int have = 0, need = countT.size();
        HashMap<Character,Integer> window = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s.length();right++){
            char rc = s.charAt(right);
            window.put(rc, window.getOrDefault(rc,0)+1);
            if (countT.containsKey(rc) && window.get(rc).equals(countT.get(rc))) have++;
            while(have == need) {
                if (resLen > right - left + 1) {
                    resLen = right - left + 1;
                    res = new int[] {left,right};
                }
                char lc = s.charAt(left);
                window.put(lc,window.get(lc)-1);
                if (countT.containsKey(lc) && countT.get(lc) > window.get(lc)) have--;
                left++;
            }
        }
        return resLen == Integer.MAX_VALUE?"":s.substring(res[0],res[1]+1);
    }
}
