class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> endMap = new HashMap<>();
        for(int i = 0 ; i< s.length(); i++) endMap.put(s.charAt(i),i);
        List<Integer> result = new ArrayList<>();
        int end = 0, size = 0;
        for (int i = 0 ;i <s.length();i++) {
            size++;
            end = Math.max(end,endMap.get(s.charAt(i)));
            if (end == i) {
                result.add(size);
                size = 0;
            }
        }
        return result;
    }
}
