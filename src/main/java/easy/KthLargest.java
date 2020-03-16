package easy;

import java.util.Stack;

public class KthLargest {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }

    public int kthLargest(TreeNode root, int k) {
        int count=0;
        TreeNode p=root;
        Stack<TreeNode> stack=new Stack<>();
        while(p!=null||!stack.isEmpty()){
            if(p!=null){
                stack.push(p);
                p=p.right;
            }else{
                p=stack.pop();
                count++;
                if(count==k) return p.val;
                p=p.left;
            }
        }
        return 0;

    }
}
