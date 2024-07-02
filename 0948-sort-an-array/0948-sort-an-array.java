class Solution {
    public int[] sortArray(int[] nums) {   
        sort (nums, 0,nums.length-1); 
        return nums;     
    }

    private void sort(int[] arr, int l, int r){
        if(l<r){
                     int m= l+(r-l)/2; 

           
            sort(arr, l, m); 
            sort(arr, m+1, r); 
            merge(arr, l, m, r); 
        }

    }
    private void merge(int[] arr, int l, int m, int r){
        m=(r+l)/2; 
        int n1= m-l+1; 
        int n2= r-m; 

        int[] left= new int[n1]; 
        int[] right = new int[n2]; 

        //copy arr els to left and right
        for(int i=0;i<n1; i++)
            left[i]=arr[l+i]; 

        for(int j=0;j<n2; j++)
            right[j]=arr[m+j+1]; 

           
            int i=0; 
            int j=0; 
            int k=l;

        while(i<n1 && j<n2){
            
            if(left[i]<=right[j]){
                arr[k]=left[i]; 
                i++; 
            }else{
                arr[k]=right[j]; 
                j++; 
            }k++; 
        }


        //remaining els
        //remainign el in left
    while(i<n1){
      arr[k]=left[i];
      k++; i++;
    }

    //remaninig in right
    while(j<n2){
      arr[k]=right[j];
      k++;
      j++;
    }
    } 
}