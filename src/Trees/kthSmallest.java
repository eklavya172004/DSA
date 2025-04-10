package Trees;

public class kthSmallest {
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


    private static int count = 0;

    public static int kthSmallest(TreeNode root, int k) {
        return helper(root,k).val;
    }

    public static TreeNode helper(TreeNode root,int k){
        if(root == null){
            return null;
        }

        TreeNode left = helper(root.left,k);

        count++;

        if(count == k){
            return root;
        }

        if(left != null){
            return left;
        }

        return helper(root.right,k);
    }

    public static void main(String[] args) {
        kthSmallest tree = new kthSmallest();

        // Creating a sample BST
        TreeNode root = tree.new TreeNode(5);
        root.left = tree.new TreeNode(3);
        root.right = tree.new TreeNode(6);
        root.left.left = tree.new TreeNode(2);
        root.left.right = tree.new TreeNode(4);
        root.left.left.left = tree.new TreeNode(1);

        int k = 3; // Find the 3rd smallest element
        System.out.println("The " + k + "rd smallest element is: " + kthSmallest(root, k));
    }
}
