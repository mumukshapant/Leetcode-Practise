class MyHashMap {
    List<Integer> l1; //key
    List<Integer> l2; //value
    int index; 

    public MyHashMap() {
        l1= new ArrayList<>(); 
        l2= new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(l1.contains(key)){
            index=l1.indexOf(key); 
            l2.remove(index); 
            l2.add(index , value); 
            
        }else{
            l1.add(key);
            l2.add(value);
        }
        
    }
    
    public int get(int key) {
        if(l1.contains(key))
        {
            index=l1.indexOf(key);
            return l2.get(index);
        }
        return -1;
    }
    
    public void remove(int key) {
         if(l1.contains(key))
        {
            index=l1.indexOf(key);
            l1.remove(index);
            l2.remove(index);
        }    
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */