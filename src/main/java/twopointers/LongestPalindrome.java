package twopointers;

public class LongestPalindrome {
    public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int right=0;
        int left=0;
        boolean[][] dp=new boolean[n][n];
        for(int i=n-2;i>=0;i--){
            dp[i][i]=true;
            for(int j=i+1;j<n;j++){
                dp[i][j]=(s.charAt(i)==s.charAt(j))&&(j-i<3||dp[i+1][j-1]);
                if(dp[i][j]&&right-left<j-i){
                    right=j;
                    left=i;
                }
            }
        }
        return right-left+1;
    }

}
