class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i) - 'a' + 1);
        }
        return transform(sb.toString(), k);
    }

    private int transform(String currentString, int k) {
        int sum = 0;
        for(int i = 0; i < currentString.length(); i++) {
            sum += currentString.charAt(i) - '0';
        }

        if(k == 1) return sum;

        return transform(String.valueOf(sum), k - 1); 
    }
}