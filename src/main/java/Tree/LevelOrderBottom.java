package Tree;
/*
给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
例如：给定二叉树 [3,9,20,null,null,15,7],
        3
        / \
        9  20
        /  \
        15   7
        返回其自底向上的层次遍历为：[[15,7],[9,20],[3]]
*/

import java.util.ArrayList;
import java.util.List;

public class LevelOrderBottom {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val=x;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        List<TreeNode> data=new ArrayList<>();
        if(root==null) return res;
        else{
            data.add(root);
            getTree(res,data);
            return res;
        }

    }

    public void getTree(List<List<Integer>> res,List<TreeNode> data){
        if(data.size()==0) return;
        List<Integer> list=new ArrayList<>();
        List<TreeNode> tmp=new ArrayList<>();
        for(int i=0;i<data.size();i++){
            if(data.get(i).left!=null){
                tmp.add(data.get(i).left);
            }
            if(data.get(i).right!=null){
                tmp.add(data.get(i).right);
            }
            list.add(data.get(i).val);
        }
        getTree(res,tmp);
        res.add(list);

    }
}
