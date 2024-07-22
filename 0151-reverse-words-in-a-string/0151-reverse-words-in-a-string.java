class Solution {
    public String reverseWords(String s) {
        // 2 pointer
        int i = 0;
        int j = 0;
        String result = "";
        String rev = "";
        int n = s.length();

        while (i < n) {
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            if (i >= n)
                break;

            j = i + 1;
            while (j < n && s.charAt(j) != ' ') {
                j++;
            }

            rev = s.substring(i, j);

            result = rev + " " + result;
            i = j + 1;
        }
        return result.trim();

    }
}