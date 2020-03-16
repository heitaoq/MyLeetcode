package easy;
/*面试题09. 用两个栈实现队列
*用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
* 分别完成在队列尾部插入整数和在队列头部删除整数的功能。
* (若队列中没有元素，deleteHead 操作返回 -1 )
* */

import java.util.LinkedList;

public class CQueue {
    LinkedList<Integer> stackA,stackB;
    public CQueue() {
        stackA= new LinkedList<Integer>();
        stackB= new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        stackA.addLast(value);
    }

    public int deleteHead() {
        if(!stackB.isEmpty()) return stackB.removeLast();
        if(stackA.isEmpty()) return -1;
        while(!stackA.isEmpty()){
            stackB.addLast(stackA.removeLast());
        }
        return stackB.removeLast();
    }
}



