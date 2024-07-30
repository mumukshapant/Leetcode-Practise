class SmallestInfiniteSet {
    //ref: https://www.youtube.com/watch?v=7hAmykNYdPc
PriorityQueue<Integer> pq; 
// let us remove set , we dont need it because pq in it self provides u

//The code works without the Set<Integer> set because the PriorityQueue<Integer> pq itself can ensure the functionality required for the SmallestInfiniteSet class.


// Set<Integer> set ; 

    public SmallestInfiniteSet() {
        pq= new PriorityQueue<>(1000); 
        //set= new HashSet<>(1000); 

        for(int i=1;i<=1000; i++){
            pq.add(i); 
           // set.add(i); 
        }
    }
    
    public int popSmallest() {
        
        int x= pq.poll(); 
        //set.remove(x); 
        return x; 
        
    }
    
    public void addBack(int num) {

        if(!pq.contains(num)){
            pq.add(num); 
            //set.add(num); 
        }
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */