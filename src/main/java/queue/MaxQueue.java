package queue;
/*面试题59 - II. 队列的最大值
请定义一个队列并实现函数 max_value 得到队列里的最大值，
要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
若队列为空，pop_front 和 max_value 需要返回 -1
* */
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue {
    Queue<Integer> queue;
    Deque<Integer> deque;
    public MaxQueue() {
        queue=new LinkedList<>();
        deque=new LinkedList<>();
    }

    public int max_value() {
        return deque.size()>0?deque.peek():-1;
    }

    public void push_back(int value) {
        while(deque.size()>0&&deque.getLast()<value){
            deque.pollLast();
        }
        queue.add(value);
        deque.addLast(value);
    }

    public int pop_front() {
        int tmp=queue.size()>0?queue.poll():-1;
        if(deque.size()>0&&tmp==deque.getFirst()) deque.removeFirst();
        return tmp;
    }
}
