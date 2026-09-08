class Solution {
    private static final long MOD = 1000000007L;

    public int countGoodNumbers(long n) {
       long evenIdx = (n + 1) / 2;    // indices  0, 2, 4,....
       long oddIdx = n / 2;           // indices  1, 3, 5,....

       long ans = (power(5, evenIdx) * power(4, oddIdx)) % MOD;

       return (int)ans;
    }

    private long power(long base, long exp) {
        if(exp == 0) return 1;

        long half = power(base, exp / 2);

        long result = (half * half) % MOD;

        if (exp % 2 == 1) {
            result = (result * base) % MOD; // For odd exponent
        }

        return result;
    }
}