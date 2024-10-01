class Solution {
    public String reverseWords(String s) {
        String temp = "";
        String res = "";
        int j = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            while (i<s.length() && s.charAt(i) == ' ') {
                i++;
            }
            if (i >= s.length())
                break;

            j = i;
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
            temp = s.substring(i, j);
             if (res.isEmpty()) {
                res = temp;
            } else {
                res = temp + " " + res;
            }

            i = j;

        }

        return res;

    }
}