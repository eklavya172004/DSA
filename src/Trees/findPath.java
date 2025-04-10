package Trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class findPath {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean findPath(TreeNode node,int[] nums){
        if (node == null){
            return nums.length == 0;
        }

        return helper(node,nums,0);
    }

    private boolean helper(TreeNode node, int[] nums, int i) {

        if (node == null){
            return false;
        }

        if (i >= nums.length || node.val != nums[i]){
            return false;
        }

        if (i == nums.length-1 && node.left == null && node.right == null){
            return true;
        }

        return helper(node.left,nums,i+1) || helper(node.right,nums,i+1);
    }

    public int pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new LinkedList<>();
        return helper(root,targetSum,path);
    }

    public int helper(TreeNode node,int sum,List<Integer> path){
        if(node == null){
            return 0;
        }

        path.add(node.val);
        int count  = 0 ;
        long s = 0;

        ListIterator<Integer> list = path.listIterator(path.size());

        while(list.hasPrevious()){
            s += list.previous();

            if(s == (long)sum){
                count++;
            }
        }

        count += helper(node.left,sum,path) + helper(node.right,sum,path);

        path.removeLast();
        return count;
    }
//    put it in a list

    public List<List<Integer>> printfindpaths(TreeNode root, int targetSum) {
        List<List<Integer>> path = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(root,targetSum,list,path);
        return path;
    }

    public void helper(TreeNode node,int sum,List<Integer> list,List<List<Integer>> path){
        if(node == null){
            return;
        }

        list.add(node.val);
//        int count  = 0 ;
        long s = 0;

        ListIterator<Integer> list2 = list.listIterator(list.size());

        while(list2.hasPrevious()){
            list.add(0,list2.previous());
            s += list2.previous();

            if(s == (long)sum){
                path.add(new ArrayList<>(list));
            }
        }

        helper(node.left,sum,list,path);
        helper(node.right,sum,list,path);

        list.remove(list.size() - 1);
    }
}
