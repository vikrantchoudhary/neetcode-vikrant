class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s: strs) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String k = String.valueOf(c);
            if (!hm.containsKey(k)) hm.put(k,new ArrayList<String>());
            hm.get(k).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
