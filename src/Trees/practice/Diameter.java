package Trees.practice;

public class Diameter {
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

    int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    public int height(TreeNode node){
        if (node ==null){
            return -1;
        }

        int leftheight = height(node.left);
        int rightheight = height(node.right);

        int dia = leftheight+rightheight+1;
        diameter = Math.max(dia,diameter);

        return Math.max(leftheight,rightheight)+1;
    }
}
