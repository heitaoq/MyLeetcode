
public class Main {

    public static void main(String args[]){
        LRUCacheMethod2 cacheMethod2=new LRUCacheMethod2(2);
        cacheMethod2.put(2,1);
        cacheMethod2.put(1,1);
        cacheMethod2.put(2,3);
        cacheMethod2.put(4,1);
        cacheMethod2.get(1);
        cacheMethod2.get(2);
    }
}
