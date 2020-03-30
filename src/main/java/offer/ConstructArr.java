package offer;
/*构建乘积数组
* 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，
* 其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。
* 不能使用除法。
* */

public class ConstructArr {
    public int[] constructArr(int[] a) {
    if(a.length==0||a==null) return null;
    int len=a.length;
    int[] b= new int[len];
    b[0]=1;
    for(int i=1;i<len;i++){
        b[i]=a[i-1]*b[i-1];
    }
    int tmp=1;
    for(int i=len-2;i>=0;i--){
        tmp*=a[i+1];
        b[i]*=tmp;
    }
    return b;
    }
}
