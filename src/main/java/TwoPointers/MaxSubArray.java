package TwoPointers;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
    int sum=nums[0];
    int tmp=nums[0];
    for(int i=1;i<nums.length;i++){
        if(tmp>0) tmp=tmp+nums[i];
        else tmp=nums[i];
        if(sum<tmp) sum=tmp;
    }
    return sum;
    }
}
