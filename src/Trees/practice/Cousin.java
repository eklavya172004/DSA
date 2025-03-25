package Trees.practice;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Cousin {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }



//    public TreeNode levelSum(TreeNode root){
//        if (root ==null){
//            return null;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        LinkedList<Integer> list = new LinkedList<>();
//
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            int level = 0 ;
//
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//
//                level += node.val;
//
//                if (node.left!=null){
//                    queue.add(node.left);
//                }
//
//                if (node.right!=null){
//                    queue.add(node.right);
//                }
//            }
//
//            list.add(level);
//        }
//    }

    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root,x);
        TreeNode yy = findNode(root,y);

        return (
                level(root,xx,0) == level(root,yy,0) && (!isSiblings(root,xx,yy))
                );
    }

    private boolean isSiblings(TreeNode root, TreeNode xx, TreeNode yy) {
        if (root==null){
            return false;
        }

        return (root.left == xx && root.right == yy) || (root.right == xx && root.left == yy) || isSiblings(root.left,xx,yy) || isSiblings(root.right
                ,xx,yy);
    }

    private int level(TreeNode root, TreeNode node, int i) {
        if (root == null){
            return 0;
        }

        if (root.val == node.val){
            return i;
        }

        int left = level(root.left,node,i+1);

        if (left!=0){
            return i;
        }

        return level(root.right,node,i+1);
    }

    public TreeNode findNode(TreeNode root,int x){
        if (root == null){
            return null;
        }

      if (root.val == x){
          return root;
      }

      TreeNode n = findNode(root.left,x);

      if (n!=null){
          return n;
      }

        return findNode(root.right,x);
    }
}
