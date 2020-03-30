package offer;

import common.ListNode;

import java.util.LinkedList;
/*面试题06. 从尾到头打印链表*/

public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack=new LinkedList<>();
        ListNode tmp =head;
        while( tmp !=null){
            stack.addLast(tmp.getVal());
            tmp=tmp.getNext();
        }
        int[] res= new int[stack.size()];
        for(int i=0;i<res.length;i++){
            res[i]=stack.removeLast();
        }
        return res;

    }
}
