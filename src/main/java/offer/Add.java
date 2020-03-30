package offer;
/*写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
* */
public class Add {
    public int add(int a, int b) {
        while (a!=0){
             int tmp=a^b;
             a=(a&b)<<1;//进位
             b=tmp;
        }
        return b;
    }
}
