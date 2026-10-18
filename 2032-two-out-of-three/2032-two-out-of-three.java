class Solution {
    public List<Integer> twoOutOfThree(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> ans = new ArrayList<>();

        // arr1 and arr2
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !ans.contains(arr1[i])) {
                    ans.add(arr1[i]);
                }
            }
        }

        // arr2 and arr3
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if (arr2[i] == arr3[j] && !ans.contains(arr2[i])) {
                    ans.add(arr2[i]);
                }
            }
        }

        // arr1 and arr3
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if (arr1[i] == arr3[j] && !ans.contains(arr1[i])) {
                    ans.add(arr1[i]);
                }
            }
        }

        return ans;
    }
}