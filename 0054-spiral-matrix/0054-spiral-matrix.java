class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        
        int m=mat.length; //row
        int n= mat[0].length; //col
        int top=0; 
        int bottom=m-1; 
        int left= 0;
        int right= n-1; 

        List<Integer> res =new ArrayList<>(); 

        while(top<=bottom && left<=right){
   
                for(int i=left;i<=right;i++)
               //top row 
                res.add(mat[top][i]); 
                top++; 

        
              for(int i=top; i<=bottom ; i++)
              //right down column 
                    res.add(mat[i][right]);
             right--; 



                //down left 
                if (top <= bottom) {
            for(int i=right; i>=left; i--)
                res.add(mat[bottom][i]);
                bottom--;
                }
                // left top --- this is WRONG !!!
            // for(int i= top;i<=top;i++)
            //     res.add(mat[i][left]);
            // left++; 

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(mat[i][left]);
                }
                left++; 
            }

}
           
       return res; 
    }
}