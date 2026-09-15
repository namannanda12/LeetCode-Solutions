class Solution {
    public int diagonalPrime(int[][] arr) {
        int n = arr.length;
        int maxPrime = 0;

        for (int i = 0; i < n; i++) {

            // Main diagonal
            if (prime(arr[i][i])) {
                maxPrime = Math.max(maxPrime, arr[i][i]);
            }

            // Secondary diagonal
            if (prime(arr[i][n - i - 1])) {
                maxPrime = Math.max(maxPrime, arr[i][n - i - 1]);
            }
        }

return maxPrime;
    }

    private boolean prime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}