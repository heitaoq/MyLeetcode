package binarysearchtree;
/*面试题33. 二叉搜索树的后序遍历序列
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。
如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
* */
public class VerifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
      return  recsion(postorder,0,postorder.length-1);
    }
    boolean recsion(int[] post,int start,int end){
        if(start>=end) return true;
        int l=start;
        while(post[l]<post[end]) l++;
        int m=l;
        while(post[l]>post[end]) l++;
        return l==end&&recsion(post,start,m-1)&&recsion(post,m,end-1);

    }
}
