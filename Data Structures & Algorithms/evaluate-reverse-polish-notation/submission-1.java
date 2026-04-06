class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int i = 0;
        int fNum,sNum;
        for ( String c : tokens) {
            switch(c) {
                case "+" : 
                    result = stack.pop() + stack.pop();
                    stack.push(result);
                    break;
                case "-" :
                    fNum = stack.pop();
                    sNum = stack.pop();
                    result = sNum - fNum;
                    stack.push(result);
                    break;
                case "*" :
                    result = stack.pop() * stack.pop();
                    stack.push(result);
                    break;
                case "/" :
                    fNum = stack.pop();
                    sNum = stack.pop();
                    if (fNum != 0 ) {
                        stack.push(sNum/fNum);
                    }
                    else {
                        stack.push(result);
                    }
                    break;
                default:
                    stack.push(Integer.parseInt(c));
            }
        }
        if (!stack.isEmpty()) return stack.pop();
        else return 0;
    }
}
