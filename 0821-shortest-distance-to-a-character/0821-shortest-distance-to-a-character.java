class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == c) {
                    int dist = Math.abs(i - j);
                    min = Math.min(min, dist);
                }
            }

            arr[i] = min;
        }

        return arr;
    }
}
