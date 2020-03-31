package BitManipulation;
/*
136. 只出现一次的数字
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
* */
//0和任何数异或得到数本身，和自己异或等于0，异或运算可以满足交换律
public class SingleNumber {
    public int singleNumber(int[] nums) {
    int res=0;
    for(int i=0;i<nums.length;i++){
        res^=nums[i];
    }
    return res;
    }
}
