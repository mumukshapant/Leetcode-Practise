class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        
        int row= mat.length; 
        int col=mat[0].length; 

        int top=0, left=0; 
        int right= col-1; 
        int bottom=row-1; 
        List<Integer> res= new ArrayList<>(); 
        
        while(top<=bottom && left<=right)
       { //top row -- top to right 

        for(int i=left;i<=right;i++){
            res.add(mat[top][i]); // 1 2 3 
        }
            top++ ; 

            //right down 
            for(int i=top ;i<=bottom ;i++){
                res.add(mat[i][right]);
            }
            right-- ; 

            if (top <= bottom) 
            for(int i=right;i>=left ;i--){
                res.add(mat[bottom][i]); 
            }
            bottom--; 

            if (left <= right) 
             for(int i=bottom ;i>=top ;i--){
                res.add(mat[i][left]);
            }left++; 

}
        
        return res;
}
}