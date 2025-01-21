class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;
        List<Integer>[] bucket = new List[n + 1];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for (int i : map.keySet()) {
            int freq = map.get(i); // mep.get(key) returns freq

            // now each bucket represents freq of the element
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();

            bucket[freq].add(i); // bucket ki frequency mein key ko add karo
        }

        // every bucket represents frequency.
        // every bucket has element with that frequency.
        // for highest freq elemtns, we iterate from the last

        int count = 0;
        int[] res = new int[k];

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (Integer num : bucket[i])
                {if (count < k) {
                    res[count] = num;
                    count++;
                }}
            }

            // if (count == k) {
            //     break;
            // }

        }

   



        return res;
    }
}