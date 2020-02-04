import java.util.HashMap;
//https://blog.csdn.net/qq_41231926/article/details/86173740

public class LRUCacheMethod2 {
    public class Node{
        private int key,value;
        Node pre,next;
        Node(){}
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    private Node head=new Node(),tail=new Node();
    private HashMap<Integer,Node> hashMap = new HashMap<Integer, Node>();
    int capacity,size;

    public void del(Node node){
        Node pre=node.pre;
        Node next=node.next;
        pre.next=next;
        next.pre=pre;
        node.pre=null;
        node.next=null;
    }
    public void add(Node node){
        Node pre=node.pre;
        Node next=node.next;


    }
}
