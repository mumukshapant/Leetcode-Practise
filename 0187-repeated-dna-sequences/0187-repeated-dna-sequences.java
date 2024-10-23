class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Map<String, Integer> repeated = new HashMap<>();
        List<String> res = new ArrayList<>();
        String sub = "";

        for (int i = 0; i <= s.length() - 10; i++) {
            sub = s.substring(i, i + 10);
            repeated.put(sub, repeated.getOrDefault(sub, 0) + 1);
            if (repeated.get(sub) > 1)
                set.add(sub);
        }
        return new ArrayList(set);

    }
}