package tree;

import java.util.LinkedList;
import java.util.List;

/*面试题34. 二叉树中和为某一值的路径
输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。
从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
给定如下二叉树，以及目标和 sum = 22，
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
* */
public class PathSum {
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
    List<List<Integer>> res=new LinkedList<>();
    List<Integer> path=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        incur(root,sum);
        return res;
    }
    public void incur(TreeNode root,int sum){
        if(root==null) return;
        path.add(root.val);
        sum-=root.val;
        if(sum==0&&root.left==null&&root.right==null){
            res.add(new LinkedList<>(path));//不直接res.add(path)的原因是path后面改变的话，res也会变动，
            // 直接重新建一个对象，就不会变了
        }
        incur(root.left,sum);
        incur(root.right,sum);
        path.remove(path.size()-1);//回退到上一个结点
    }
}
