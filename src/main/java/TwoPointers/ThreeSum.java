package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length) {
            if (nums[i] > 0) return result;
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            for (int j = i + 1, k = nums.length - 1; j < k;) {
                if(j>i+1&&nums[j]==nums[j-1]){
                    j++;
                    continue;
                }
                if(k<nums.length-1&&nums[k]==nums[k+1]){
                    k--;
                    continue;
                }
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    k--;
                }
                if (sum < 0) {
                    j++;
                }
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
            }
            i++;
        }
        return result;
    }
}
