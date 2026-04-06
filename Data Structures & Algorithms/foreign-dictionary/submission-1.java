class Solution {
    public String foreignDictionary(String[] words) {
       Map<Character,Set<Character>> adjNodes = new HashMap<>();
       Map<Character,Integer> indegree = new HashMap<>();
       for (String word : words) {
        for (char c : word.toCharArray()){
            adjNodes.putIfAbsent(c, new HashSet<>());
            indegree.putIfAbsent(c,0);
        }
       }
       int n = words.length;
       for (int i = 0 ; i< n -1 ; i++) {
        String s1 = words[i];
        String s2 = words[i+1];
        int minLen = Math.min(s1.length(),s2.length());
        if (s1.length() > s2.length() && 
        s1.substring(0,minLen).equals(s2.substring(0,minLen))) return "";
        for (int j= 0; j < minLen; j++) {
            if (s1.charAt(j) == s2.charAt(j)) continue;
            if (!adjNodes.get(s1.charAt(j)).contains(s2.charAt(j))){
                adjNodes.get(s1.charAt(j)).add(s2.charAt(j));
                indegree.put(s2.charAt(j), indegree.get(s2.charAt(j))+1);
            }
            break;
        }
       }
       Queue<Character> queue = new LinkedList<>();
       for (char c: indegree.keySet()) {
        if (indegree.get(c) == 0) queue.offer(c);
       }
       StringBuilder result = new StringBuilder();
       while (!queue.isEmpty()){
        char c = queue.poll();
        result.append(c);
        for (char ch : adjNodes.get(c)) {
            indegree.put(ch, indegree.get(ch) - 1);
            if (indegree.get(ch) == 0) queue.add(ch);
        }
       }
       if (result.length() != indegree.size()) return "";
       return result.toString();
    }
}
