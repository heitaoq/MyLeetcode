package twopointers;
/*给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），
可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。

        示例 1:
        输入: [1,3,4,2,2]
        输出: 2*/

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid) count++;
            }
            if(count>mid) right=mid-1;
            else left=mid+1;
        }
    return left;
    }
}
