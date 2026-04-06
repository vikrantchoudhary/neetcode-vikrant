class Solution {
    public boolean isHappy(int n) {
        //if (n == 1) return true;
        int slow = n , fast = sumofSquare(n);
        while (slow != fast) {
            fast = sumofSquare(fast);
            fast = sumofSquare(fast);
            slow = sumofSquare(slow);
        }
        return fast == 1;
       
    }
    public int sumofSquare(int n) {
        int output = 0;
        while (n !=0 ) {
            output += (n%10) * (n%10);
            n = n/10;
        }
        return output;
    }
}
