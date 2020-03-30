package offer;
/*给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值
* 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
输出: [3,3,5,5,6,7]
* */
import java.util.PriorityQueue;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0||k<0||nums==null) return new int[0];
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a, b) -> b - a);
        for(int i=0;i<k;i++){
            queue.add(nums[i]);
        }
        int[] res=new int[nums.length-k+1];
        res[0]=queue.peek();
        int j=1;
        for(int i=k;i<nums.length;i++){
            queue.remove(nums[i-k]);
            queue.add(nums[i]);
            res[j++]=queue.peek();
        }
        return res;
    }
}
