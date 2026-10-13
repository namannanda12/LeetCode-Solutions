
class Solution {
    public int getMinDistance(int[] arr, int target, int start) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if(arr[i] == target) {
                min = Math.min(min, Math.abs(i - start));
            }
        }

        return min;
    }
}
