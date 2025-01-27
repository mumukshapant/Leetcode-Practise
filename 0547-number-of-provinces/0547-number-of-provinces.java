class Solution {
    public int findCircleNum(int[][] mat) {
        int n= mat.length; 
        int count=0; 

        boolean[] vis = new boolean[n]; 

        for(int i=0;i<n;i++){

            if(vis[i]==false){
                count++; 
                dfs(mat, i, vis); 
            }

        }
        return count; 
        
    }
    private void dfs(int[][] mat, int node, boolean[] vis){

        int n= mat.length; 

        for(int i=0;i<n; i++){
            if(mat[node][i] ==1  && vis[i] ==false)
            {
                vis[i]=true; 

                dfs(mat, i, vis); 


            }
        }

    }
}