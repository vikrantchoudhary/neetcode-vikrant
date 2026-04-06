class Solution {
    private List<String> result = new ArrayList<>();
    private String[] digitToChar = {
           "", "", "abc", "def", "ghi", "jkl", "mno", "qprs", "tuv", "wxyz" 
        };
    public List<String> letterCombinations(String digits) {
      if (digits.isEmpty()) return result;
      backtrack(0,"",digits);
      return result;  
    
    }
    private void backtrack(int i, String curString, String digits) {
        if (curString.length() == digits.length()) {
            result.add(curString);
            return;
        }
        String chars = digitToChar[digits.charAt(i) - '0'];
        for (char c :  chars.toCharArray()) {
            backtrack(i+1,curString+c,digits);
        }
    }
}
