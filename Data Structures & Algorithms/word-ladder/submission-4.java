class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wset = new HashSet<>(wordList);
        if (!wordList.contains(endWord) || beginWord.equals(endWord)) return 0;
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int step = 0;
        while (!queue.isEmpty()){
            step++;
            for (int j = queue.size(); j > 0; j--) {
                String cur = queue.poll();
                if (cur.equals(endWord)) return step;
                //wset.remove(cur);
                for(int i = 0 ; i <cur.length(); i++) {
                    for (char c='a' ; c <= 'z'; c++) {
                        char[] arr = cur.toCharArray();
                        if (arr[i] == c ) continue;
                        arr[i] = c;
                        String midWord = new String(arr);
                        if (wset.contains(midWord)) {
                            queue.offer(midWord);
                            //step++;
                            wset.remove(midWord);
                        }
                    }
                }
            }
           
        }
        return 0;
    }
}
