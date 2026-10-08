class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int counter = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                if (counter > 0)
                    ans.append(ch);
                counter++;
            } else {
                counter--;
                if (counter > 0)
                    ans.append(ch);
            }
        }

        return ans.toString();
    }
}