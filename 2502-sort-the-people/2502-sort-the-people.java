class Solution {
    public String[] sortPeople(String[] names, int[] height) {

        int n= height.length; 

        for(int i=0;i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(height[j]<height[j+1]){
                    int temp= height[j]; 
                    height[j]= height[j+1]; 
                    height[j+1]= temp; 


                    String stemp = names[j]; 
                    names[j]= names[j+1]; 
                    names[j+1]= stemp; 
                }
            }
        }

        return names; 
        
    }
}