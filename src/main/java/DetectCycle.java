//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
//进阶：
//你是否可以不用额外空间解决此题？
//https://blog.csdn.net/sinat_35261315/article/details/79205157
public class DetectCycle {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode detectCycle(ListNode head) {
          ListNode first=new ListNode(0);
          ListNode second=new ListNode(0);
          first=head;
          second=head;
          while(second!=null&&second.next!=null) {
              first=first.next;
              second=second.next.next;
              if(first==second) break;
          }
          if(second==null||second.next==null) return null;
          else{
              ListNode tmp=head;
              while(tmp!=first){
                  tmp=tmp.next;
                  first=first.next;
              }
              return first;
          }
    }
}
