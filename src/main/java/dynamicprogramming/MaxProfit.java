package dynamicprogramming;
/*面试题63. 股票的最大利润
假设把某股票的价格按照时间先后顺序存储在数组中，
请问买卖该股票一次可能获得的最大利润是多少？
* */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if(prices.length==0||prices==null) return 0;
        int min=prices[0];
        int[] dp=new int[prices.length];
        dp[0]=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min) min=prices[i];
            dp[i]=Math.max(dp[i-1],prices[i]-min);
        }
        return dp[prices.length-1];
    }
}
