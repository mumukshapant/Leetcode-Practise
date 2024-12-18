class Solution {
    public List<Integer> spiralOrder(int[][] mat) {

        int n= mat.length; 
        int m= mat[0].length; 

        int top=0, right=m-1; 
        int bottom=n-1, left=0; 

        List<Integer> res= new ArrayList<>(); 

        while(top<=bottom && left<=right){

            // top right
     
            for(int i= left; i<=right;i++)
                res.add(mat[top][i]); 
            top++; 


            //right down 
            for(int i=top;i<=bottom; i++)
                res.add(mat[i][right]);
            right--; 


            //bottom left -- add condition
              if (top <= bottom) {
            for(int i=right;i>=left; i--)
                res.add(mat[bottom][i]); 
            bottom--;
              }

              

            //left top 
            if(left<=right)
  {          for(int i=bottom ;i>=top;i--)
                res.add(mat[i][left]); 
            left++; }


        }
        return res; 
        
    }
}