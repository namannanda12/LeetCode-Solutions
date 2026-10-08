class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> ans = new ArrayList<>();

        for (String word : words) {

            String lowerWord = word.toLowerCase();

            String row;

            // First character ki row find karo
            if (row1.indexOf(lowerWord.charAt(0)) != -1) {
                row = row1;
            } else if (row2.indexOf(lowerWord.charAt(0)) != -1) {
                row = row2;
            } else {
                row = row3;
            }

            boolean valid = true;

            // Check karo saare characters same row mein hain
            for (char ch : lowerWord.toCharArray()) {
                if (row.indexOf(ch) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans.add(word);
            }
        }

        // ArrayList ko String[] mein convert karo
        return ans.toArray(new String[0]);
    }
}