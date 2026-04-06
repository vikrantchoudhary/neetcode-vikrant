class Solution {
    private List<List<String>> res = new ArrayList<>();
    private List<String> part = new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(0,0,s);
        return res;
    }
    private void dfs(int i , int j, String s){
        if (j >= s.length()) {
            if (i == j) {
                res.add(new ArrayList<>(part));
            }
            return;
        }
        if (isPalindrom(s,i,j)) {
            part.add(s.substring(i,j+1));
            dfs(j+1,j+1,s);
            part.remove(part.size() - 1);
        }
        dfs(i,j+1,s);
    } 
    private boolean isPalindrom(String s , int l , int r) {
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            }else {
                return false;
            }
            
        }
        return true;
    }
}
