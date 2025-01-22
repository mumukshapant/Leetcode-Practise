class Solution {
    public List<String> letterCombinations(String s) {
        List<String> res = new ArrayList<>();

        if (s.isEmpty())
            return res;

        StringBuilder curr = new StringBuilder();

        helper(s, 0, curr, res);
        return res;

    }

    private void helper(String s, int index, StringBuilder curr, List<String> res) {
        // base case
        if (index == s.length()) {
            res.add(curr.toString());
            return ;
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        String mapping = map.get(s.charAt(index)); // 'abc'
        
        for (int i = 0; i < mapping.length(); i++) {

            // iterate mapping values

            curr.append(mapping.charAt(i));
            helper(s, index + 1, curr, res);
            curr.deleteCharAt(curr.length() - 1);
        }
    }

}