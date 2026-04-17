class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        boolean carry = true;
        for (int i = n -1 ; i>=0 ; i--) {
            if (carry){
                if (digits[i] == 9) {
                    digits[i] = 0;
                }else {
                    digits[i]++;
                    carry = false;
                }
            }
        }
        if (carry) {
            int [] result = new int [n+1];
            result[0] = 1;
            System.arraycopy(digits,0,result,1,n);
            return result;
        }
        return digits;
    }
}
