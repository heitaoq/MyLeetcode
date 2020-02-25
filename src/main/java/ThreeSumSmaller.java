/*给定一个长度为 n 的整数数组和一个目标值 target，寻找能够使条件 nums[i] + nums[j] + nums[k] < target 成立的三元组  i, j, k 个数（0 <= i < j < k < n）。
        输入: nums = [-2,0,1,3], target = 2
        输出: 2
        解释: 因为一共有两个三元组满足累加和小于 2:
        [-2,0,1]
        [-2,0,3]*/

import java.util.Arrays;
import java.util.List;
public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while (right>left){
                if(nums[i]+nums[left]+nums[right]<target){
                    res=res+right-left;
                    left++;
                }else
                    right--;

            }
        }
        return res;
    }
}
