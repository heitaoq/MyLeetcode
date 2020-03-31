package BitManipulation;
/*
260. 只出现一次的数字 III
给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。
示例 :
输入: [1,2,1,3,2,5]
输出: [3,5]
* */
public class SingleNumber2 {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        //找到两个不同数 哪一位不同
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        //用mask找到相异的第一个位置
        int mask=1;
        while((mask&xor)==0) mask=mask<<1;
        int num1=0;
        int num2=0;
        //两个不同的数 在有差异的位置跟1相与的结果肯定不一样
        for(int i=0;i<nums.length;i++){
            if((mask&nums[i])==0) num1^=nums[i];
            else num2^=nums[i];
        }
        return new int[]{num1,num2};
    }
}
