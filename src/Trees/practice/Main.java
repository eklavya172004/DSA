package Trees.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        BST tree = new BST();
//        tree.populate(scanner);
//        tree.preetyDisplay();
        BinarySearchTree tree = new BinarySearchTree();
        int[] nums = {1,2,3,4,5,6,7};

        tree.populateSorted(nums);
        tree.display();
    }
}

