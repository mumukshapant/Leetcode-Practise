class Solution {
    public long totalCost(int[] cost, int k, int candidates) {
//ref : https://www.youtube.com/watch?v=ODuICq8exLo

  if (cost == null || cost.length == 0 || k <= 0 || candidates <= 0) {
            return 0;
        }


        PriorityQueue<Integer>  leftpq = new PriorityQueue<>();  
        PriorityQueue<Integer>  rightpq = new PriorityQueue<>();  


        //fill initial candidates from both ends 
        int l=0; 
        int r= cost.length-1; 

        while(leftpq.size() <candidates && l<=r){
            leftpq.offer(cost[l]);
            l++; 
        }

        while(rightpq.size()<candidates && r>=l){
            rightpq.offer(cost[r]); 
            r--; 
        }

        long total=0; 

        for(int i=0; i<k; i++){

            if(leftpq.isEmpty()){

                total+=rightpq.poll(); 

                if(r>=l){
                    rightpq.offer(cost[r]); 
                        r--; 
                }

            }
            
            
            
            
            else if (rightpq.isEmpty()){

                 total+=leftpq.poll(); 
                    
                    if(l<=r){
                        leftpq.offer(cost[l]); 
                        l++; 
                    }

            }
            
            
            
            
            else{
                if(leftpq.peek()<=rightpq.peek()){
                    total+=leftpq.poll(); 
                    
                    if(l<=r){
                        leftpq.offer(cost[l]); 
                        l++; 
                    }
                }
                else{

                    total+=rightpq.poll(); 
                    if(r>=l){
                        rightpq.offer(cost[r]); 
                        r--; 
                    }
                }
            }

            
        }

        return total; 
        
    }
}