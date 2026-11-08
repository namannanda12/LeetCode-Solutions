class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            int count = 0;

            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i].equals(arr1[j])) {
                    count++;
                }
            }

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    count++;
                }
            }

            if (count == 1) {
                ans.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            int count = 0;

            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i].equals(arr1[j])) {
                    count++;
                }
            }

            for (int j = 0; j < arr2.length; j++) {
                if (arr2[i].equals(arr2[j])) {
                    count++;
                }
            }

            if (count == 1) {
                ans.add(arr2[i]);
            }
        }

        return ans.toArray(new String[0]);
    }
}