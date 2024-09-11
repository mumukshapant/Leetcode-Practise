class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int n=m.length; 
        int ma= m[0].length; 

        int left=0; 
        int top=0;
        
        int right=ma-1; 
        int bottom=n-1;

        List<Integer> res= new ArrayList<>(); 


        while(top<=bottom && left<=right){

            // left to right 
            for(int i =left ;i<=right; i++){
                res.add(m[top][i]);
            }
            top ++; // top =1 


            // rightmost top to bottom -- col remains same , ie , 2 ( right ) 
            for(int i=top; i<=bottom; i++){
                res.add(m[i][right]); // m[1][2] , m[2][2]
            } 
            right--; // right =1

            //bottom : Right to left 

            if (top <= bottom) 
           { for(int i=right;i>=left;i--){
                res.add(m[bottom][i]);
            }
            bottom--; }

if (left <= right) 
            {for(int i=bottom;i>=top;i--){
                res.add(m[i][left]);
            }
            left++;} 



        }
        return res; 
        
    }
}