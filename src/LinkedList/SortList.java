package LinkedList;

class SortList {
    int val;
    SortList next;

    SortList() {}

    SortList(int val) {
        this.val = val;
    }

    SortList(int val, SortList next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public SortList sortList(SortList head) {
        if (head == null || head.next == null) { // Fix base case
            return head;
        }

        SortList middle = middleNode(head);
//        SortList rightHalf = middle.next; // Store right half
//        middle.next = null;

        SortList left = sortList(head);
        SortList right = sortList(middle);

        return mergeTwoLists(left,right);
    }

//    public SortList middleNode(SortList head) {
//        SortList slow = head;
//        SortList fast = head;
//        SortList prev = null;
//
//        while(fast!=null && fast.next != null){
//            prev = slow;
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return prev;
//    }
    public SortList middleNode(SortList head){
        SortList prev = null;

        while(head!=null && head.next !=null){
            prev = (prev==null)? head : prev.next;
            head = head.next.next;
        }

        SortList mid = prev.next;
        prev.next = null;
        return mid;
    }

    public SortList mergeTwoLists(SortList list1, SortList list2) {
        SortList f = list1;
        SortList s = list2;

        SortList list = new SortList();
        SortList temp = list;

        while(f!=null && s!=null){
            if(f.val>s.val){
                temp.next = s;
                s = s.next;
            }else{
                temp.next = f;
                f = f.next;
//                temp = temp.next;
            }
                temp = temp.next;
        }

        while(s!=null){
            temp.next = s;
            s = s.next;
            temp = temp.next;
        }

        while(f!=null){
            temp.next = f;
            f = f.next;
            temp = temp.next;
        }

        return list.next;
    }

    // Helper function to print the linked list (for testing)
    public static void printList(SortList head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Creating a test linked list: 4 -> 2 -> 1 -> 3
        SortList head = new SortList(4, new SortList(2, new SortList(1, new SortList(3))));

        System.out.println("Original list:");
        printList(head);

        SortList sortedHead = solution.sortList(head);

        System.out.println("Sorted list:");
        printList(sortedHead);
    }
}
