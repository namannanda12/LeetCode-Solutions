class Solution {
    public int[] separateDigits(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String str = "";
            str += arr[i];

            for(int j = 0; j < str.length(); j++) {
                ans.add(str.charAt(j) - '0');
            }
        }

        int[] result = new int[ans.size()];

        for(int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        
        return result;
    }
}