package TwoPointers;

/*
给定M×N矩阵，每一行、每一列都按升序排列，请编写代码找出某元素。
*/
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0) return false;
        int m=0;
        int n=matrix[0].length;
        while(m<matrix.length&&n>=0){
            if(matrix[m][n]==target) return true;
            else if(matrix[m][n]<target) m++;
                else n--;
        }
        return false;
    }
}
