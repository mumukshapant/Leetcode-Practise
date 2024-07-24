class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // count sort

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        // find the max element -- that would be the size of count arr
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] bucket = new List[n + 1];

        for (int i : map.keySet()) {
            int freq = map.get(i);

            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();

            bucket[freq].add(i);

        }

        int[] res = new int[k];
        int count = 0;
        for (int i = bucket.length - 1; i >= 0 && count < k; i--) {
            if (bucket[i] != null) {
                for (Integer integer : bucket[i]) {
                    res[count] = integer;
                    count++;
                }
            }
        }
        return res;

    }
}