package offer;
/*面试题04. 二维数组中的查找
* 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
* 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
* */
public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
    if(matrix.length==0||matrix[0].length==0||matrix==null) return false;
    int col=matrix[0].length-1;
    int row=0;
    while(row<matrix.length&&col>=0){
        if(matrix[row][col]==target) return true;
        if(matrix[row][col]>target) col--;
        else row++;
    }
    return false;
    }
}
