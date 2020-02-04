//import java.util.LinkedHashMap;
//import java.util.Map;
//
//class LRUCache {
//    private CachMap cashMap;
//
//    public LRUCache(int capacity) {
//        cashMap=new CachMap(capacity);
//    }
//
//    public int get(int key) {
//        return cashMap.getOrDefault(key,-1);
//    }
//
//    public void put(int key, int value) {
//        cashMap.put(key,value);
//    }
//
//    class CachMap extends LinkedHashMap<Integer,Integer> {
//        private int max;
//        CachMap(int max){
//            super(max,0.75f,true);
//            this.max=max;
//        }
//        protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
//            return size()>max;
//        }
//    }
//}