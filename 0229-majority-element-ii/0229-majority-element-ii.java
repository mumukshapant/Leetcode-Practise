class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> res= new ArrayList<>(); 

        Map<Integer, Integer> map = new HashMap<>(); 
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
int n= nums.length;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()>n/3)
                res.add(e.getKey());
        }

        return res; 
    }
}