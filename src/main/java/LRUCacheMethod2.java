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
        Node tmp=head.next;
        head.next=node;
        node.pre=head;
        node.next=tmp;
        tmp.pre=node;
    }
    LRUCacheMethod2(int capacity){
        head.next=tail;
        tail.pre=head;
        this.capacity=capacity;
        this.size=0;
    }
    public void put(int key,int value){
        Node node=hashMap.get(key);
        if(node!=null){
            node.value=value;
            del(node);
            add(node);
        }else{
            if(size>=capacity){
                Node delNode=tail.pre;
                hashMap.remove(delNode.key);
                del(delNode);
                size--;
            }
            Node addNode=new Node(key,value);
            add(addNode);
            hashMap.put(key,addNode);
            size++;
        }

        }

    public int get(int key){
        Node node = hashMap.get(key);
        if(node==null) return -1;
            del(node);
            add(node);
            return node.value;
    }

}
