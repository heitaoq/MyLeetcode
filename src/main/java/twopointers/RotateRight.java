package twopointers;

/*给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
示例 1:输入: 1->2->3->4->5->NULL, k = 2
       输出: 4->5->1->2->3->NULL
  解释:向右旋转 1 步: 5->1->2->3->4->NULL
       向右旋转 2 步: 4->5->1->2->3->NULL*/
public class RotateRight {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int i=0;
        ListNode p=head;
        ListNode q=new ListNode(0);
        q.next=head;
        ListNode m=new ListNode(0);
        m.next=head;
        while(p != null){
            p=p.next;
            q=q.next;
            i++;
        }
        k=i-k%i;
        while(k>0){
            m=m.next;
            k--;
        }
        q.next=head;
        ListNode tmp=m.next;
        m.next=null;
        return tmp;
    }
}
