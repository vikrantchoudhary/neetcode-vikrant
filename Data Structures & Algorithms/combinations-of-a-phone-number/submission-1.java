class Solution {
    String[] digitToString = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() <1 || digits == null) return result;
        backtrack(digits,"",result);
        return result;
    }
    private void backtrack(String digits,String curString,List<String> result){
        if (digits.length() == 0){
            result.add(curString);
            return;
        }
        String ch = digitToString[digits.charAt(0)-'0'];
        for (char c : ch.toCharArray()){
            backtrack(digits.substring(1),curString+c,result);
        }
    }
}
