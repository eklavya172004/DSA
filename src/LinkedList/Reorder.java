package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Reorder {
    public void reorderList(Node head) {
        if(head == null || head.next == null){
            return;
        }

        Node mid = middleNode(head);
        Node hs  = reverseList(mid);
        Node hf = head;

        while (hf != null && hs != null){
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        if (hf!=null){
            hf.next = null;
        }
    }

    public Node reverseList(Node head) {
        Node prev = null;
        Node pres = head;

        while(pres != null){
            Node nex = pres.next;
            pres.next = prev;
            prev = pres;
            pres = nex;
        }

        return prev;
    }

    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while(fast!=null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        // Instantiate Reorder and print the original list
        Reorder reorder = new Reorder();
        System.out.println("Original List:");
        reorder.printList(head);

        // Call reorderList (logic to be implemented)
        reorder.reorderList(head);

        // Print list after (should remain unchanged for now)
        System.out.println("List after reordering (no change yet):");
        reorder.printList(head);
    }
}
