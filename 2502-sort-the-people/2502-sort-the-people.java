class Solution {
    public String[] sortPeople(String[] names, int[] nums) {
Map<Integer, String> map = new HashMap<>(); 
        for(int i=0;i<nums.length; i++){
            map.put(nums[i], names[i]); 
        }
        Arrays.sort(nums); 
        String[] temp = new String[nums.length]; 
        
        //descending order
        int j=0; 
        for(int i=nums.length-1;i>=0;i--){
            
            temp[j++]=map.get(nums[i]);

        }
        return temp; 
    }
}