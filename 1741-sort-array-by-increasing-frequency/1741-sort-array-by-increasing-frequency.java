class Solution {
    public int[] frequencySort(int[] nums) {

        int n = nums.length; 
        Integer[] arr = new Integer[n];

        Map<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < n; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1); 
            arr[i]=nums[i]; // 1 1  2 2 2  3 
        }

        Arrays.sort(arr, (a,b) -> 
        {if(map.get(a) != map.get(b) )
            return map.get(a)- map.get(b); 
        else 
            return b-a; 
        }
        
        
        
        ); 

         for (int  i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;



        
      }
}