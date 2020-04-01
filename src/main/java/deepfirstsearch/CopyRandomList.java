package deepfirstsearch;

import java.util.*;

/*面试题35. 复杂链表的复制
请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，
还有一个 random 指针指向链表中的任意节点或者 null。
* */
public class CopyRandomList {
    public class Node{
        int val;
        Node next;
        Node random;
        Node(int val){
            this.val=val;
            next=null;
            random=null;
        }
    }
    HashMap<Node,Node> map=new HashMap<>();

    public Node copyRandomList(Node head) {
        return dfs(head);

    }
    public Node dfs(Node head){
        if(head==null) return null;
        if(map.containsKey(head)) return map.get(head);
        Node copyNode=new Node(head.val);
        map.put(head,copyNode);
        copyNode.next=dfs(head.next);
        copyNode.random=dfs(head.random);
        return copyNode;
    }
}
