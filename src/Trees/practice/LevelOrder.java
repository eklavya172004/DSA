package Trees.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0 ; i < size ; i++){
                TreeNode node = queue.poll();

                    level.add(node.val);

                    if(node.left!=null){
                        queue.add(node.left);
                    }

                    if(node.right!=null){
                        queue.add(node.right);
                    }
            }

            result.addFirst(level);
        }

        return result;
    }

    public TreeNode findSuccessor(TreeNode root,int key){
            if (root == null){
                return null;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null){
                queue.add(node.left);
            }

            if (node.right != null){
                queue.add(node.right);
            }

            if (node.val ==key){
                break;
            }
        }

        return queue.peek();
    }

    public static void main(String[] args) {

    }
}
