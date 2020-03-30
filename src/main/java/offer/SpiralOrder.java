package offer;
/*
顺时针打印矩阵
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
* */

public class SpiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0) return new int[0];
        int l=0;int r=matrix[0].length-1;int t=0;int b=matrix.length-1;
        int x=0;
        int[] res=new int[(r+1)*(b+1)];
        while(true){
            for(int i=l;i<=r;i++) res[x++]=matrix[t][i];
            if(++t>b) break;
            for(int i=t;i<=b;i++) res[x++]=matrix[i][r];
            if(--r<l) break;
            for(int i=r;i>=l;i--) res[x++]=matrix[b][i];
            if(--b<t) break;
            for(int i=b;i>=t;i--) res[x++]=matrix[i][l];
            if(++l>r) break;
        }
        return res;
    }
}
