package LinkedList;

class Sum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Reverse both lists
        ListNode list1 = reverse(l1);
        ListNode list2 = reverse(l2);

        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        int carry = 0;

        // Process both lists
        while (list1 != null || list2 != null || carry > 0) {
            int sum = carry;

            if (list1 != null) {
                sum += list1.val;
                list1 = list1.next;
            }
            if (list2 != null) {
                sum += list2.val;
                list2 = list2.next;
            }

            carry = sum / 10;
            prev.next = new ListNode(sum % 10);
            prev = prev.next;
        }

        // Reverse the result to get the final answer
        return reverse(dummy.next);
    }

    // Reverse Linked List Function
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }

        return prev;
    }

    // Helper function to print the linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Main function to test the solution
    public static void main(String[] args) {
        Sum solution = new Sum();

        // Example test case: l1 = [9], l2 = [1,9,9,9,9,9,9,9,9,9]
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                        new ListNode(9, new ListNode(9))))))))));

        ListNode result = solution.addTwoNumbers(l1, l2);
        solution.printList(result); // Expected Output: 0 -> 0 -> 0 -> 0 -> 0 -> 0 -> 0 -> 0 -> 0 -> 0 -> 1
    }
}
