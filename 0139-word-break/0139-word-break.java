class Solution {
    public boolean wordBreak(String s, List<String> dict) {

        Queue<Integer> q = new LinkedList<>();
        Set<String> set = new HashSet<>(dict);
        boolean[] seen = new boolean[s.length() + 1];

        q.add(0); // start index

        while (!q.isEmpty()) {
            
            int start = q.remove(); // 0

            if(start==s.length())
                return true; 

            for (int end = start + 1; end <= s.length(); end++) {

                //if I miss this, some cases not running. why ? need to check .
                 if(seen[end])
                    continue;

                if (set.contains(s.substring(start, end))) {
                    q.add(end);
                    seen[end] = true;
                    
                }

            }
        }

        return false;

    }
}