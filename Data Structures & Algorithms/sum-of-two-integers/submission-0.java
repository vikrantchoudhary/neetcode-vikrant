class Solution {
    public int getSum(int a, int b) {
        while(a != 0) {
            int carr = (a & b) << 1;
            b ^=a;
            a = carr;
        }
        return b;
    }
}
