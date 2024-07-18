class MyHashMap {
    int[] arr;
    boolean[] bool;

    public MyHashMap() {
        arr = new int[10000001];
        bool = new boolean[10000001];
    }

    public void put(int key, int value) {
        arr[key] = value;
        bool[key] = true;

    }

    public int get(int key) {
        if (bool[key]) {
           // bool[key] = false;
            return arr[key];
        }
        return -1;

    }

    public void remove(int key) {
        
        bool[key] = false;

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */