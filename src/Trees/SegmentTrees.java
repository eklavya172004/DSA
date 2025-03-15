package Trees;

public class SegmentTrees {
    //node will contain the data start interval , end interval - range , data , left, right - pointer
    private class Node{
        int data;
        int startinterval;
        int endinterval;
        Node left;
        Node right;

        public Node(int startinterval,int endinterval){
            this.startinterval = startinterval;
            this.endinterval = endinterval;
            Node left = null;
            Node right = null;
        }
    }

    private Node root;

    public Node initialize(int[] nums,int start,int end){
        if (start > end){
            return null;
        }

        Node node = new Node(start,end);

        if (start == end){
            node.data = nums[start];
            return node;
        }

        int mid = (start+end)/2;

        node.left = initialize(nums,start,mid);
        node.right = initialize(nums,mid+1,end);

        node.data = node.left.data + node.right.data;

        return node;
    }

    public void initialize(int[] nums) {
        root = initialize(nums, 0, nums.length - 1);
    }

//    query
    public int query(int qsi,int qei){
        return query(root,qsi,qei);
    }

    private int query(Node node,int qsi,int qei){

//Complete overlapping
        if (node.startinterval>=qsi && node.endinterval <= qei){
            return node.data;
        }
//No overlapping
        if (node.endinterval < qsi || node.startinterval > qei){
            return 0;
        }

//Partial overlapping
        return query(node.left,qsi,qei) + query(node.right,qsi,qei);
}

public void update(int index,int value){
       this.root.data = update(root,index,value);
}

private int update(Node node,int index,int value){
        if (index >= node.startinterval && index <= node.endinterval){
            if (index == node.startinterval && index == node.endinterval){
                node.data = value;
                return node.data;
            }else {
                int leftchild = update(node.left,index,value);
                int rightchild = update(node.right,index,value);

                node.data = leftchild + rightchild;
                return node.data;
            }
        }
        return node.data;
}

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        String str = "";

        if (node.left != null){
            str = str + "Interval=["+node.left.startinterval+" - " + node.left.endinterval+"] and data => "+ node.left.data;
        }else {
            str += "No left child";
        }

        str = str + "Interval=["+node.startinterval+" - " + node.endinterval+"] and data => "+ node.data + " => ";

        if (node.right != null){
            str = str + "Interval=["+node.right.startinterval+" - " + node.right.endinterval+"] and data => "+ node.right.data;
        }else {
            str += "No right child";
        }

        System.out.println(str);

        //call recursively

        if (node.left!=null){
            display(node.left);
        }

        if (node.right!=null){
            display(node.right);
        }
    }
}
