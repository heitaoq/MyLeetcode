public class ReverseList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){this.val=val;}
    }
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, next = null, cur = head;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}

