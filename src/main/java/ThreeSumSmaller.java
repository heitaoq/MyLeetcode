import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=nums[0];
        int i=0;
        int iter=1;
        int iterm=1;
        while(sum<target&i<nums.length){
           if(i>1){
               iter=iter*i;
           }
           if(i>3){
               iterm=iterm*(i-3);
           }
            i++;
            sum=sum+nums[i];
        }
        return iter/iterm*6;
    }
}
