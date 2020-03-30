package offer;
/*
输入两个链表，找出它们的第一个公共节点。
如下面的两个链表：
在节点 c1 开始相交。
利用a+b+相交=b+a+相交即可*/
public class GetIntersectionNode {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA=headA;
        ListNode nodeB=headB;
        while(nodeA != nodeB){
            nodeA=nodeA==null?headB:nodeA.next;
            nodeB=nodeB==null?headA:nodeB.next;
        }
        return nodeA;
    }
}
