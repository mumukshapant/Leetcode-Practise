/**

 */
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        Queue<Integer> q= new LinkedList<>(); 
        q.add(0); 

        boolean[] vis = new boolean[rooms.size()]; 

        while(!q.isEmpty()){

            int curr= q.poll(); 
            
            if(vis[curr]){
                continue; 
            }

            vis[curr]=true; 

            for(int nbr: rooms.get(curr)){
                if(!vis[nbr])
                    q.add(nbr); 
            }
            
            
            
            }
            
            for(boolean room : vis)
                if(!room)
                    return false; 


        return true; 

        
    }
}