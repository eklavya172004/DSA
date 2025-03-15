package Trees.practice;

public class BinarySearchTree {
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;

    public BinarySearchTree(){

    }

    public boolean isEmpty(){
        return root == null;
    }

    public int height(Node node){
        if (node == null){
            return -1;
        }

        return node.height;
    }

    public void insert(int value){
        root = insert(root,value);
    }

    private Node insert(Node node,int value){
        if (node == null){
            node = new Node(value);
            return node;
        }

        if (value<node.value){
            node.left = insert(node.left,value);
        }

        if (value>node.value){
            node.right = insert(node.right,value);
        }

        node.height = Math.max(height(node.left) , height(node.right))+1;

        return node;
    }

    public void display(){
        display(root,"Root node: ");
    }

    private void display(Node node,String details){
        if (node == null){
            return;
        }

        System.out.println(details + node.value);

        display(node.left,"left child of "+node.getValue()+" :");
        display(node.right,"right child of "+node.getValue()+" :");
    }

    public boolean balanced(Node node){
        if (node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }

    private void populateSorted(int[] nums,int start,int end){
        if (start>=end){
            return;
        }

        int mid = (start+end)/2;

        this.insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);
    }

    public void preorder(){
        preorder(root);
    }

    private void preorder(Node node){
        if (node == null){
            return;
        }

        System.out.println(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }
}
