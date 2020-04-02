package greedy;
/*面试题14- I. 剪绳子
给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
每段绳子的长度记为 k[0],k[1]...k[m] 。请问 k[0]*k[1]*...*k[m] 可能的最大乘积是多少？
例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
* */
public class CuttingRope {
    public int cuttingRope(int n) {
        if(n>0&&n<=3) return n-1;
        else {
            int a=n/3;
            int b=n%3;
            if(b==0) return (int)Math.pow(3,a);
            else if(b==2) return (int)Math.pow(3,a)*2;
            else return (int)Math.pow(3,a-1)*4;
        }

    }
}
