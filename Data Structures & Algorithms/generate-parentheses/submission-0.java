class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtracking(0,0,n,stack,result);
        return result;
    }
    private void backtracking(int openN, 
        int closeN,int n, StringBuilder stack,List<String> result) {
        if (openN == closeN && openN == n){
            result.add(stack.toString());
            return;
        }
        if (openN < n) {
            stack.append("(");
            backtracking(openN+1,closeN,n,stack,result);
            stack.deleteCharAt(stack.length() - 1);
        }
        if(closeN < openN){
            stack.append(")");
            backtracking(openN,closeN+1,n,stack,result);
            stack.deleteCharAt(stack.length() - 1);
        }
    }
}
