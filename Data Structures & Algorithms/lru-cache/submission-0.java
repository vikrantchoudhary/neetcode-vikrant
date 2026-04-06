class LRUCache {
    final int capacity;
    final HashMap<Integer,Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<Integer,Integer>(capacity,0.75f,true) {
            protected boolean removeEldestEntry(Map.Entry<Integer,Integer>eldest) {
                //int cursize = eldest.size();
                return size() > LRUCache.this.capacity;
            }
        };
    }
    
    public int get(int key) {
        if (map.containsKey(key)) return map.get(key);
        return -1;
    }
    
    public void put(int key, int value) {
        map.put(key,value);
    }
}
