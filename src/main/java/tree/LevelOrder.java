package tree;

import java.util.*;

/*面试题32 - I. 从上到下打印二叉树
给定二叉树: [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
* */
public class LevelOrder {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public int[] levelOrder(TreeNode root) {
        if(root==null) return new int[0];
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tmp=queue.poll();
            list.add(tmp.val);
            if(tmp.left !=null) queue.add(tmp.left);
            if(tmp.right !=null) queue.add(tmp.right);
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
