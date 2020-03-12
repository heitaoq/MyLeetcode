package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length){
            if (i>0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int j=i+1;
            while(j<nums.length){
                if (j>i+1 && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }
                for (int m = j + 1, n = nums.length - 1; m < n;) {
                    if(m>j+1&&nums[m]==nums[m-1]){
                        m++;
                        continue;
                    }
                    if(n<nums.length-1&&nums[n]==nums[n+1]){
                        n--;
                        continue;
                    }
                    int sum = nums[i] + nums[j] + nums[m]+nums[n];
                    if (sum > target) {
                        n--;
                    }
                    if (sum < target) {
                        m++;
                    }
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[m],nums[n]));
                        m++;
                        n--;
                    }
                }
                j++;
            }
            i++;
        }
        return result;
    }
}
