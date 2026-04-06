class TimeMap {
    Map <String,Map<Integer,List<String>>> keystore;
 // key, value = map<timestamp,List<values>>

    public TimeMap() {
        keystore  = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!keystore.containsKey(key)) {
            keystore.put(key,new HashMap<>());
        }
        if (!keystore.get(key).containsKey(timestamp)) {
            keystore.get(key).put(timestamp,new ArrayList<>());
        }
        keystore.get(key).get(timestamp).add(value);
    }
    
    public String get(String key, int timestamp) {
        if (!keystore.containsKey(key)) return "";
        int seen = 0;
        for (int time : keystore.get(key).keySet()) {
            if (time <= timestamp) {
                seen = Math.max(seen,time);
            }
        }
        if (seen ==0) return "";
        int back = keystore.get(key).get(seen).size() -1 ;
        return keystore.get(key).get(seen).get(back);

    }
}
