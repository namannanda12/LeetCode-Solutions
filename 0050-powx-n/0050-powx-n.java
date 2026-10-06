class Solution {
    public double myPow(double x, int n) {
        long N = Math.abs((long) n);
        double result = 1.0;
        double base = x;

        while (N > 0) {
            if ((N & 1) == 1) result *= base;
            base *= base;
            N >>= 1;
        }

        return n < 0 ? 1.0 / result : result;
    }
}