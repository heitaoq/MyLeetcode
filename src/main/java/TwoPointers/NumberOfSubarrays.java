package TwoPointers;

import java.util.HashMap;
/*给你一个整数数组 nums 和一个整数 k。
        如果某个 连续 子数组中恰好有 k 个奇数数字，我们就认为这个子数组是「优美子数组」。
        请返回这个数组中「优美子数组」的数目。

        示例 1：
        输入：nums = [1,1,2,1,1], k = 3
        输出：2
        解释：包含 3 个奇数的子数组是 [1,1,2,1] 和 [1,2,1,1]*/

public class NumberOfSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int sum=0;
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int j=0;j<nums.length;j++){
            sum+=nums[j]&1;
            if (map.keySet().contains(sum-k)) res+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}
