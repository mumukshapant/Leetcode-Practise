class Solution {
    public int lengthOfLongestSubstring(String s) {
        // sliding window

        // i
        // a b c a b c b b

        int i = 0, j = 0;
        int maxlen = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {

            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                maxlen = Math.max(j - i + 1, maxlen);
                j++;

            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxlen;
    }
}