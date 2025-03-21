package Trees.practice;

import java.util.*;

public class Zigzag {
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean rev = false;

        while (!queue.isEmpty()) {
            int size = queue.size();

            List<Integer> level = new ArrayList<>();

            for(int i = 0 ; i < size ; i++){

                if (rev){
                    TreeNode node = queue.removeLast();

                    level.add(node.val);

                    if(node.left!=null){
                        queue.addFirst(node.left);
                    }

                    if(node.right!=null){
                        queue.addFirst(node.right);
                    }


                }else {
                    TreeNode node = queue.removeFirst();

                    level.add(node.val);

                if(node.left!=null){
                    queue.addLast(node.left);
                }

                if(node.right!=null){
                    queue.addLast(node.right);
                }

                }

//                level.add(node.val);
            }

            rev = !rev;

            result.add(level);

        }

        return result;

    }
}
