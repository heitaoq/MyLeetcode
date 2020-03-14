package twopointers;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode tmp=head;
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                tmp.next=l2;
                l2=l2.next;
            }
            else {
                tmp.next=l1;
                l1=l1.next;
            }
            tmp=tmp.next;
        }
        if(l1==null) tmp.next=l2;
        if(l2==null) tmp.next=l1;
        return head.next;

    }

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){this.val=val;}
    }
}
