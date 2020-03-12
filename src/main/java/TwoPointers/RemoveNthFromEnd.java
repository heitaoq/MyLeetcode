package TwoPointers;

/*给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
  示例：给定一个链表: 1->2->3->4->5, 和 n = 2.
        当删除了倒数第二个节点后，链表变为 1->2->3->5*/
public class RemoveNthFromEnd {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode q= new ListNode(0);
        q.next=head;
        ListNode p=head;
        ListNode newHead=q;
        int i=1;
        while(p !=null){
            if(i>n) q=q.next;
            p=p.next;
            i++;
        }
        q.next=q.next.next;
        return newHead.next;
    }
}
