class DSU{

    List<Integer> rank = new ArrayList<>(); 
    List<Integer> parent= new ArrayList<>(); 

    //constr 
    public DSU( int n ){

    for(int i=0;i<=n; i++){
        rank.add(0); 
        parent.add(i); 
    }
    }

//ultimate parent 
    public int getParent(int node){

        
        if(parent.get(node) == node) //if 1 is parent of itself
            return node; 

        int ultimatepar = getParent(parent.get(node)); 
        parent.set(node, ultimatepar); 

        return parent.get(node); 

    }

    public void getRankUnion(int u, int v){

        int uparent_u= getParent(u); 
        int uparent_v= getParent(v) ; 

        if(uparent_u==uparent_v)
            return ; 

        //cases 
        // 1 :   rank u > rank v      v joins u 

        // set ( index, item)
        if(rank.get(uparent_u) > rank.get(uparent_v)){
            parent.set(uparent_v, uparent_u) ; 
        }
        //case 2 : 
        else if (rank.get(uparent_u)< rank.get(uparent_v)){
            parent.set(uparent_u, uparent_v); 
        }
        
        //case 3 : when rank is same -- attach anyone to anyone. we do v joins u 
        // rank of u is updated 
        else{
            parent.set(uparent_v, uparent_u) ; 

            int rank_u= rank.get(uparent_u); 
            rank.set(uparent_u, rank_u+1); 
        }
    } 

}

class Solution {


    public int[] findRedundantConnection(int[][] edges) {

        DSU obj = new DSU(edges.length); 

        for(int[] e: edges){

            int u= e[0]; 
            int v =e[1]; 

            if(obj.getParent(u)== obj.getParent(v) ) 
                return e; 
            else
                obj.getRankUnion(u, v); 
        }
        return new int[0]; 
        
    }
}