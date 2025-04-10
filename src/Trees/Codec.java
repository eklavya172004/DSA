package Trees;


import java.util.*;

//Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
//
//Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
//
//Clarification: The input/output format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.

public class Codec {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root,list);
         return String.join(",", list);
    }

    public void helper(TreeNode node,List<String> list){
        if(node == null){
        list.add("null");
        return;
        }

        list.add(String.valueOf(node.val));
        helper(node.left,list);
        helper(node.right,list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
         List<String> resultList = new LinkedList<>(Arrays.asList(data.split(",")));
        Collections.reverse(resultList);
        return deserialize(resultList);
    }

    private TreeNode deserialize(List<String> list){
        String val = list.remove(list.size()-1);

        if(val.charAt(0) == 'n'){
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = deserialize(list);
        node.right = deserialize(list);

        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));