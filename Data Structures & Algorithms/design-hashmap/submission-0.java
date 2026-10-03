class MyHashMap {
    private Map<Integer,Integer> hash;

    public MyHashMap() {
        hash=new HashMap<>();
    }
    
    public void put(int key, int value) {
        hash.put(Integer.valueOf(key),Integer.valueOf(value));
    }
    
    public int get(int key) {
        return hash.getOrDefault(Integer.valueOf(key),-1);
        
    }
    
    public void remove(int key) {
        hash.remove(Integer.valueOf(key));
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */