class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        rec(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
     private void rec(int[] arr, int idx, List<Integer> curr, List<List<Integer>> ans) {
        if(idx == arr.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(arr[idx]);
        rec(arr, idx + 1, curr, ans); // pick

        curr.remove(curr.size() - 1); // undo 

        rec(arr, idx + 1, curr, ans); // skip
     }
}