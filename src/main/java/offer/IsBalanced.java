package offer;
/*输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，
那么它就是一棵平衡二叉树。*/
public class IsBalanced {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return isBalanced(root.left)&&isBalanced(root.right)&&(Math.abs(depath(root.left)-depath(root.right))<=1);

    }
    public int depath(TreeNode root){
        if(root==null) return 0;
        else return Math.max(depath(root.left),depath(root.right))+1;
    }
}
