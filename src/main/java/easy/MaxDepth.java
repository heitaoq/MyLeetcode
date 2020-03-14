package easy;
import common.TreeNode;
/*面试题55 - I. 二叉树的深度*/

public class MaxDepth {
    public int maxDepth(TreeNode root) {
    if(root ==null) return 0;
    else return Math.max(maxDepth(root.getLeft()),maxDepth(root.getRight()))+1;
    }
}
