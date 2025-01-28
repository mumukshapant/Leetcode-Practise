class DSU{

    List<Integer> parent = new ArrayList<>(); 
    List<Integer> rank = new ArrayList<>(); 

    public DSU(int n ){
        for(int i=0;i<=n; i++){
            
            rank.add(0); 
            parent.add(i); 

        }

    }

    public int findUParent(int node){

        if(node== parent.get(node))
            return node; 
        
        int uparent = findUParent(parent.get(node)); 
        parent.set(node, uparent); 
        return parent.get(node); 
    }

    public void getUnionByRank(int u, int v){

        int uparent_u = findUParent(u); 
        int uparent_v = findUParent(v); 

        if(uparent_u == uparent_v)
            return; 
        
        // if( rank.get(uparent_u) == rank.get(uparent_v) )//equal rank, attach anyoen to anyone. the one where we are attaching becomes the parent and its rank increments ( lets assume we attach v to u )
        // {
        //     parent.set(uparent_u, uparent_v); 
        //     rank.get(uparent_u)++; 
        // }

         if (rank.get(uparent_u) > rank.get(uparent_v)){
            
            parent.set(uparent_v, uparent_u); 
        }else if (rank.get(uparent_u) < rank.get(uparent_v)){
            
            parent.set(uparent_u , uparent_v); 
        }    else {
            parent.set(uparent_v, uparent_u); 
            int rank_u = rank.get(uparent_u); 
            rank.set(uparent_u, rank_u+1); 
        }

    }



}




class Solution {


    public int[] findRedundantConnection(int[][] edges) {

        int n= edges.length; 

        DSU obj = new DSU(n);
         for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            if (obj.findUParent(u) == obj.findUParent(v)) {
                // If u and v are already connected, this edge is redundant
                return edge;
            } else {
                obj.getUnionByRank(u, v);
            }
        }

        return new int[0];



    
    }
}