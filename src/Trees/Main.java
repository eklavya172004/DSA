package Trees;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        BinarySearchTree tree = new BinarySearchTree();
//        int[] nums = {2,45,78,22,10};
////        tree.populate(nums);
////        tree.display();
//
//        tree.populateSorted(nusm2);
//        tree.display();

//        AVL tree = new AVL();
//        ArrayList<Integer> nums = new ArrayList<>();
//
//        for (int i = 0; i < 1000; i++) {
//            nums.add(i);
//        }

//        Collections.shuffle(nums); // Shuffle to insert in a more balanced way

//        for (int num : nums) {
//            tree.insert(num);
//        }
//
//        tree.display();
//        System.out.println("Height of AVL Tree: " + tree.height());

        int[] nums = {3, 8, 7, 6, -2, 9, 4};
        SegmentTrees st = new SegmentTrees();
        st.initialize(nums);

        System.out.println("Sum from index 1 to 4: " + st.query(1, 4)); // Expected: 8+7+6+(-2) = 19
    }
}
