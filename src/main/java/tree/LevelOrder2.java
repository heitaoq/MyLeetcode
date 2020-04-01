package tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*面试题32 - III. 从上到下打印二叉树 III
请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，
第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 * */
public class LevelOrder2 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return  new ArrayList();
        Deque<TreeNode> deque=new LinkedList<>();//双端队列既能当队列使用也能当栈使用
        List<List<Integer>> list=new ArrayList<>();
        deque.add(root);
        while(!deque.isEmpty()){
            //奇数项打印
            List<Integer> tmplist=new ArrayList<>();
            for(int i=deque.size();i>0;i--){
                TreeNode tmp=deque.removeFirst();
                tmplist.add(tmp.val);
                if(tmp.left !=null) deque.addLast(tmp.right); //添加到后面
                if(tmp.right !=null) deque.addLast(tmp.left);
            }
            list.add(tmplist);
            if(deque.isEmpty()) break;
            //偶数项打印
            tmplist=new ArrayList<>();
            for(int i=deque.size();i>0;i--){
                TreeNode tmp=deque.removeLast();
                tmplist.add(tmp.val);
                if(tmp.right!=null) deque.addFirst(tmp.right);//添加到前面
                if(tmp.left!=null) deque.addFirst(tmp.left);
            }
            list.add(tmplist);
        }
        return list;
    }
}
