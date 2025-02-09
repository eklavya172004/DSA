package LinkedList;


// * Definition for singly-linked list.

import java.util.List;

class Partion {
    private static class Node {
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.val = val; this.next = next; }
    }
    public Node partition(Node head, int x) {
        if (head == null || head.next==null){
            return head;
        }

        Node less = new Node(0,head);
        Node les = less;
        Node great = new Node(0,head);
        Node grt = great;

        Node temp = head;

        while (temp !=null){

            if(temp.val<x){
                les.next = temp;
                les = temp;
            }else{
                grt.next = temp;
                grt = temp;
            }

            temp = temp.next;
        }

        grt.next = null;
        les.next = great.next;

        return less.next;
    }

    public static void main(String[] args) {
        Partion partitioner = new Partion();

        // Creating a linked list: 1 -> 4 -> 3 -> 2 -> 5 -> 2
        Node head = new Node(1, new Node(4, new Node(3, new Node(2, new Node(5, new Node(2))))));

        System.out.println("Original list:");
        printList(head);

        int x = 3; // Partion value
        Node newHead = partitioner.partition(head, x);

        System.out.println("Partioned list (with x = " + x + "):");
        printList(newHead);
    }

    private static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}