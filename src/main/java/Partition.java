/*给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
你应当保留两个分区中每个节点的初始相对位置。
示例:输入: head = 1->4->3->2->5->2, x = 3
     输出: 1->2->2->4->3->5*/

public class Partition {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public ListNode partition(ListNode head, int x) {
    ListNode preHead1=new ListNode(0);
    ListNode preHead2=new ListNode(0);
    ListNode curHead1=preHead1;
    ListNode curHead2=preHead2;
    while(head!=null){
        if(head.val<x){
            curHead1.next=head;
            curHead1=curHead1.next;
        }else{
            curHead2.next=head;
            curHead2=curHead2.next;
        }
        head=head.next;
    }
    curHead2.next=null;
    curHead1.next=preHead2.next;
    return preHead1.next;
    }
}
