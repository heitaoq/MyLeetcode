package offer;

public class PrintNumbers {
    public int[] printNumbers(int n) {
        int base=10;
        for(int i=1;i<n;i++){
            base*=10;
        }
        int[] print=new int[base-1];
        for(int i=1;i<base;i++){
            print[i]=i;
        }
        return print;
    }
}
