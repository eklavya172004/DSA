package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int value){
            this.val = value;
            this.left = null;
            this.right = null;
        }
    }

    public void bfs(TreeNode node){
        if (node == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null); // Level separator

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current == null) {
                System.out.println(); // Move to a new line after completing a level

                // If the queue still has elements, add another level separator
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
                continue;
            }

            System.out.print(current.val + " "); // Print nodes in the same level

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        BFS tree = new BFS(); // Create an instance of BFS

        // Build the tree
        TreeNode root = tree.new TreeNode(1); // Use tree.new because TreeNode is non-static
        root.left = tree.new TreeNode(2);
        root.right = tree.new TreeNode(3);
        root.left.left = tree.new TreeNode(0);
        root.left.right = tree.new TreeNode(5);
        root.right.right = tree.new TreeNode(10);

        // Run BFS
        tree.bfs(root); // Should print: 1 2 3 4 5 6
    }
}
