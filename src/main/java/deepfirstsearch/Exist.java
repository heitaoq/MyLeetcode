package deepfirstsearch;
/*面试题12. 矩阵中的路径
请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。
如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
[["a","b","c","e"],
["s","f","c","s"],
["a","d","e","e"]]
但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，
路径不能再次进入这个格子。
* */
public class Exist {
    public boolean exist(char[][] board, String word) {
        char[] chars=word.toCharArray();
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==chars[0]&&dfs(board,chars,i,j,row,col,0))
                    return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,char[] chars,int r,int c,int row,int col,int k){
        if(c<0||r<0||c>col-1||r>row-1||board[r][c]!=chars[k]) return false;
        if(k==chars.length-1) return true;
        char tmp=board[r][c];
        board[r][c]='#';
        boolean flag=dfs(board,chars,r+1,c,row,col,k+1)||dfs(board,chars,r,c+1,row,col,k+1)
                ||dfs(board,chars,r-1,c,row,col,k+1)||dfs(board,chars,r,c-1,row,col,k+1);
        board[r][c]=tmp;
        return flag;
    }
}
