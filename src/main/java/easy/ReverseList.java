package easy;

import java.util.List;

public class ReverseList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode p= new ListNode(0);
        ListNode q=head.next;
        p=head;
        head.next=null;
        while(q!=null){
            ListNode tmp=q.next;
            q.next=p;
            p=q;
            q=tmp;
        }
       return p; 
    }
}
