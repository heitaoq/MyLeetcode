package breadthfirstsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListOfDepth {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val=x;
        }
    }
    public ListNode[] listOfDepth(TreeNode tree) {
        if(tree==null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        int size=1;
        List<ListNode> list=new ArrayList<>();
        ListNode head = new ListNode(0);
        ListNode first = head;
        queue.add(tree);
        while(queue.size()>0){
            if(size>0){
                size--;
                TreeNode tmp=queue.poll();
                first.next=new ListNode(tmp.val);
                first=first.next;
                TreeNode tmp1=queue.poll().left;
                if(tmp.left !=null)
                    queue.add(tmp.left);
                if(tmp.right !=null)
                    queue.add(tmp.right);
            }else{
                list.add(head.next);
                size=queue.size();
                head=new ListNode(0);
                first=head;
            }
         }
        list.add(head.next);
        ListNode[] arry = new ListNode[list.size()];
        int j=0;
        for(ListNode l:list){
            arry[j++]=l;
        }
        return arry;
        }
}
