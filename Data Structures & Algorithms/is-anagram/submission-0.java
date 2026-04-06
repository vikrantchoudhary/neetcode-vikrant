class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null )return true;
        if (s.length() != t.length()) return false;
        HashMap<Character,Integer> hs = new HashMap<>();
        for (char c : s.toCharArray()) {
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        for (char c : t.toCharArray()) {
            if (!hs.containsKey(c) || hs.get(c) == 0 ) return false;
            hs.put(c,hs.get(c)-1);
        }
        if (!hs.containsValue(0))return false;
        return true;
    }
}
