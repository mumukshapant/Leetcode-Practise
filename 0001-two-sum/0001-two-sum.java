class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute 
        int[] res= new int[2];
        int sum=0;
        Map<Integer,Integer> map = new HashMap<>(); 

        for(int i=0;i<nums.length ; i++){
            int num= nums[i];
            int moreneeded= target-num; 
            if(map.containsKey(moreneeded))
                {res[0]=map.get(moreneeded); 
                res[1]=i; }
                map.put(num, i);
            
        }

        return res; 
    }
}