package deepfirstsearch;

public class MinFlips {
    int m, n;
    int ans = 10;
    int[][] dir = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int minFlips(int[][] mat) {
        m = mat.length;
        n = mat[0].length;
        int diff = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    diff++;
                }
            }
        }
        dfs(mat, 0, 0, diff, 0);
        if (ans == 10) {
            return -1;
        } else {
            return ans;
        }
    }
    public void dfs(int[][] mat, int i, int j, int diff, int cnt) {
        // j = n 代表进入列数的边界，转换坐标并重新进入递归
        // i 变为下一行，j 变为第一列
        if (j == n) {
            j = 0;
            i = i + 1;
            dfs(mat, i, j, diff, cnt);
            return;
        }
        // 找到全零矩阵，更新答案，结束递归
        if (diff == 0) {
            ans = Math.min(ans, cnt);
            return;
        }
        // i = m 代表遍历完单元格，结束递归
        if (i == m) {
            return;
        }
        // newDiff 为反转某个单元格及其相邻单元格产生的影响，即 1 的个数变化
        int newDiff = help(mat, i, j);
        dfs(mat, i, j + 1, diff + newDiff, cnt + 1);
        // 再次反转，消除影响
        help(mat, i, j);
        dfs(mat, i, j + 1, diff, cnt);
    }

    // 反转 (i,j) 以及相邻单元格，并获取 1 的个数变化
    public int help(int[][] mat, int i, int j) {
        // cnt 为 1 的个数变化
        int cnt = 0;
        if (mat[i][j] == 0) {
            cnt++;
        } else {
            cnt--;
        }
        mat[i][j] = 1 - mat[i][j];
        // 遍历相邻单元格
        for (int[] d : dir) {
            int nx = i + d[0], ny = j + d[1];
            if (nx < 0 || nx >= m || ny < 0 || ny >= n) {
                continue;
            }
            if (mat[nx][ny] == 0) {
                cnt++;
            } else {
                cnt--;
            }
            mat[nx][ny] = 1 - mat[nx][ny];
        }
        return cnt;
    }
}
