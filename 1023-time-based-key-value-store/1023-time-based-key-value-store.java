class Node{
    int time; 
    String value; 
    Node(int time, String value){
        this.time= time; 
        this.value= value;
    }
}

class TimeMap {       
     Map<String, List<Node> > map;


    public TimeMap() {
        map= new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
     Node newNode = new Node(timestamp,value);

     if(map.containsKey(key)){
            map.get(key).add(newNode);
        }else{
            List<Node>l = new ArrayList<>();
            l.add(newNode);
            map.put(key,l);
        }

    }
    
    public String get(String key, int timestamp) {

        if(!map.containsKey(key))
            return ""; 
        List<Node> l= map.get(key); 

        return binarysearch(l, 0, l.size()-1 , timestamp); 
        
    }

    private String binarysearch(List<Node> l, int left, int right, int target){
        String result = ""; // Default result if no valid timestamp is found

        while(left<=right){
            int mid= left+(right-left)/2; 

            if(l.get(mid).time < target)
              {
                result = l.get(mid).value; // Update result with the latest valid value
                left = mid + 1; // Search for a closer valid timestamp
            }
            
            else if ( l.get(mid).time > target)
                right= mid-1; 
            
            else    
                return l.get(mid).value;  
        }
        return result;

    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */