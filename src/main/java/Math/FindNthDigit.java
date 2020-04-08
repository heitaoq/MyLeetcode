package Math;
/*面试题44. 数字序列中某一位的数字
数字以0123456789101112131415…的格式序列化到一个字符序列中。
在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
请写一个函数，求任意第n位对应的数字。
* */

public class FindNthDigit {
    public int findNthDigit(int n) {
        if(n<=9) return n;
        n--;
        int len=1;
        long base=1;
        while(n>9*base*len){
            n-=9*base*len;
            len++;
            base=base*10;
        }
        int target=(int)Math.pow(10,len-1)+n/len;
        int dig=n%len;
        return String.valueOf(target).charAt(dig)-'0';

    }
}
