package binarysearchtree;
/*面试题36. 二叉搜索树与双向链表
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。
要求不能创建任何新的节点，只能调整树中节点指针的指向。
* */
public class TreeToDoublyList {
    public class Node{
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
    Node pre=null;
    public Node treeToDoublyList(Node root) {
    if(root==null) return root;
    Node p=root;Node q=root;
    while(p.left!=null) p=p.left;
    while(q.right!=null) q=q.right;
    inorder(root);
    p.left=q;
    q.right=p;
    return p;
    }

    public void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        if(pre!=null) pre.right=root;
        root.left=pre;
        pre=root;
        inorder(root.right);
    }
}
