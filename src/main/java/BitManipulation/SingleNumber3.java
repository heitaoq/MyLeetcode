package BitManipulation;
/*面试题56 - II. 数组中数字出现的次数 II
在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
* */
public class SingleNumber3 {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int num:nums){
                if((num&(1<<i))!=0) count++;
            }
            if(count%3!=0) res+=(1<<i);
        }
        return res;

    }
}
