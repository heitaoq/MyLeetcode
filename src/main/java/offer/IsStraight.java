package offer;

import java.util.Arrays;

public class IsStraight {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zeroCount=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0) {
                zeroCount++;
                continue;
            }
            if(nums[i]==nums[i+1]) return false;
            if(nums[i+1]-nums[i]>1){
                zeroCount-=nums[i+1]-nums[i]-1;
            }
        }
        return zeroCount>=0;
    }
}
