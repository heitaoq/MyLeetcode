package easy;
/*面试题22
链表中倒数第k个节点   */
import common.ListNode;

public class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode one=head;
        ListNode two=head;
        int i=0;
        while(one !=null){
            one=one.getNext();
            i++;
            if(i>k) two=two.getNext();
        }
        return two;
    }
}
