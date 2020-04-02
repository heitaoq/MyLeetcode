package recursion;
/*面试题46. 把数字翻译成字符串
给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，
……，25 翻译成 “z”。
一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
* */
public class TranslateNum {
    public int translateNum(int num) {
        if(num<=9) return 1;
        int end=num%100;
        if(end<=9||end>=26) return translateNum(num/10);//结尾两位数字小于9或者大于26代表周后一位只能有一种翻译
        else return translateNum(num/10)+translateNum(num/100);
    }
}
