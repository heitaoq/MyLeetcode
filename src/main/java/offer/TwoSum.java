package offer;
/*面试题60. n个骰子的点数
把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出s的所有可能的值出现的概率。
你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。
* */
public class TwoSum {
    public double[] twoSum(int n) {
        int[][] dp=new int[n+1][6*n+1];
        for(int i=1;i<=6;i++){
            dp[1][i]=1;
        }
        for(int i=2;i<n+1;i++){
            for(int s=2;s<6*n+1;s++){
                for(int d=1;d<=6;d++){
                    if(s-d<i-1) break;
                    dp[i][s]+=dp[i-1][s-d];
                }
            }
        }
        double[] res=new double[5*n+1];
        for(int i=n;i<=6*n;i++){
            res[i-n]=dp[n][i]/ Math.pow(6,n);
        }
        return res;
    }
}
