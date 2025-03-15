package Trees;

import RecursionPractice.Pattern;

import java.util.Scanner;

public class BST {

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

//    insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter the left of: "+node.value);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter the value of the left of : "+ node.value);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to enter the right of: "+node.value);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter the value of the right of : "+ node.value);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner,node.right);
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node,String indent){
        if (node==null){
            return;
        }

        System.out.println(indent + node.value);
        display(node.left , indent +"\t");
        display(node.right , indent +"\t");

    }

    public BST(){

    }

    public void prettyDisplay(){
        prettydisplay(root,0);
    }

    private void prettydisplay(Node node,int level){
        if(node == null){
            return;
        }

        prettydisplay(node.right,level+1);

        if(level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|--------->" +node.value);
        }else{
            System.out.println(node.value);
        }

        prettydisplay(node.left,level+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST tree = new BST();
        tree.populate(scanner);
        tree.prettyDisplay();
    }
}
