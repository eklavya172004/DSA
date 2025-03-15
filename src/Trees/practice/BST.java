package Trees.practice;

import java.util.Scanner;

public class BST {
    private static class Node {
        Node left;
        Node right;
        int value;


        public  Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner,root);
    }

    private void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter the left of: "+node.value);
        boolean left = scanner.nextBoolean();

        if (left){
            System.out.println("Enter the value you want to enter: ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to enter the right of: " + node.value);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter the value you want to enter: ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node,String indent){
        if (node == null){
            return;
        }

        System.out.println(indent+node.value);
        display(node.left,"\t");
        display(node.right,"\t");
    }

    public BST(){

    }

    public void preetyDisplay(){
        preetyDisplay(root,0);
    }

    private void preetyDisplay(Node node,int level){
        if (node == null){
            return;
        }
            preetyDisplay(node.right,level+1);

        if (level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.value);
        }else {
            System.out.println(node.value);
        }

        preetyDisplay(node.left,level+1);
    }
}
