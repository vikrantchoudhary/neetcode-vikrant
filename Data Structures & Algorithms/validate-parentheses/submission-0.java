class Solution {
    public boolean isValid(String s) {
        if (s == null) return true;
        if (s.length() %2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else {
                if(stack.isEmpty()) return false;
                char p = stack.pop();
                if (c == '}' && p != '{') return false;
                if (c == ')' && p != '(') return false;
                if (c == ']' && p != '[') return false;
            }
        }
        if (!stack.isEmpty())return false;
        return true;

    }
}
