import java.util.HashMap;

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
