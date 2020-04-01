package Media;

import java.util.HashMap;

/*
* 面试题07. 重建二叉树
* 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
* 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
* */
public class BuildTree {
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      if(preorder.length==0||preorder==null) return null;
      for(int i=0;i<inorder.length;i++){
          map.put(inorder[i],i);
      }
      return buildTree(preorder,0,preorder.length,inorder,0,inorder.length,map);
    }

    public TreeNode buildTree(int[] preorder,int prestar,int preend,int[] inorder,int instar,int inend,HashMap<Integer,Integer> map){
        if(prestar>preend) return null;
        TreeNode root= new TreeNode(preorder[prestar]);
        if(prestar==preend) return root;
        else {
            int index=map.get(root.val);
            int leftNodes=index-instar;
            int rightNodes=inend-index;
            TreeNode left=buildTree(preorder,prestar+1,prestar+leftNodes,inorder,instar,index-1,map);
            TreeNode right=buildTree(preorder,prestar+leftNodes+1,preend,inorder,index+1,inend,map);
            root.left=left;
            root.right=right;
        }
        return root;
    }
}
