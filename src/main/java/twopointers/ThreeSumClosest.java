package twopointers;

import java.util.Arrays;

//最接近的三数之和
/*给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).*/
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int tmp=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-tmp)<Math.abs(target-result)) result=tmp;
                if(tmp>target) right--;
                else if(tmp<target) left++;
                else return result;
            }
        }
        return result;
    }
}
