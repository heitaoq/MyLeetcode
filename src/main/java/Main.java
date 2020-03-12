import TwoPointers.BalancedString;

//数组中元素的值代表位置
//map中的key
public class Main {

    public static void main(String args[]){
        int[] test={1,1,2,1,1};
        String str="QQWE";
        BalancedString balancedString=new BalancedString();
       System.out.printf(""+balancedString.balancedString(str));
    }
}
