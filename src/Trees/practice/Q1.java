package Trees.practice;

import java.util.ArrayList;
import java.util.List;

//public class Q1
//}
  public class Q1 {
      int val;
      Q1 left;
      Q1 right;
      Q1() {}
      Q1(int val) { this.val = val; }
      Q1(int val, Q1 left, Q1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

    public List<Integer> inorderTraversal(Q1 root) {
        List<Integer> list1 = new ArrayList<>();
        if (root == null){
            return list1;
        }


        List<Integer> list = new ArrayList<>();
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);

        list1.addAll(list);

        return list1;
    }
  }