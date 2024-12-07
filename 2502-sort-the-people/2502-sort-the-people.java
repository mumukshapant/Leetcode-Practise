class Solution {
    public String[] sortPeople(String[] names, int[] nums) {
        String[] temp = new String[nums.length]; 
        for(int i=0;i<nums.length; i++){
            for(int j=i;j<nums.length; j++){
                if(nums[i]<nums[j]){
                    String t= names[i]; 
                    names[i]=names[j]; 
                    names[j]=t; 
                }
            }
        }
        return names; 
    }
}