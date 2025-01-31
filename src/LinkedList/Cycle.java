package LinkedList;

//import java.lang.classfile.components.ClassPrinter;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Cycle {
    private ListNode head;
    private ListNode tail;

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                return true;
            }
        }

        return false;
    }

    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                ListNode temp = slow;
                int count = 0;

                do{
                    temp = temp.next;
                    count++;
                }while (temp!=slow);

                return count;
            }
        }

        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }

        //find the start node
        ListNode f = head;
        ListNode s = head;

        while (length>0){
            s = s.next;
            length--;
        }

        //keeping it moving forward till they meet
        while (s!=f){
            s = s.next;
            f = f.next;
        }

        return f;
    }

    private class ListNode{
        private int val;
        private ListNode next;

        public ListNode(int val){
            this.val = val;
        }

        public ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}