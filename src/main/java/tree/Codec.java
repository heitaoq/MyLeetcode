package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*面试题37. 序列化二叉树
请实现两个函数，分别用来序列化和反序列化二叉树。
你可以将以下二叉树：
    1
   / \
  2   3
     / \
    4   5
序列化为 "[1,2,3,null,null,4,5]"
* */
public class Codec {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public String serialize(TreeNode root) {
        if(root==null) return "[]";
        StringBuilder sb=new StringBuilder("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
           TreeNode tmp= queue.poll();
           if(tmp==null) sb.append("null,");
           else {
               sb.append(tmp.val+",");
               queue.add(tmp.left);
               queue.add(tmp.right);
           }
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();

    }

    public TreeNode deserialize(String data) {
        if(data.equals("[]")) return null;
        String[] strs=data.substring(1,data.length()-1).split(",");
        TreeNode root=new TreeNode(Integer.parseInt(strs[0]));
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int i=1;
        while (!queue.isEmpty()){
            TreeNode tmp=queue.poll();
            if(!strs[i].equals("null")){
                TreeNode node=new TreeNode(Integer.parseInt(strs[i]));
                tmp.left=node;
                queue.add(node);
            }
            i++;
            if(!strs[i].equals("null")){
                TreeNode node=new TreeNode(Integer.parseInt(strs[i]));
                tmp.right=node;
                queue.add(node);
            }
            i++;
        }
        return root;
    }
}
