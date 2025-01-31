package LinkedList;

public class CircularLL {
    private Node head;
    private Node tail;

    public CircularLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val){
        //this is also the potential answer
//        if (head == null){
//            return;
//        }
//
//        Node node = head;
//
//        if (head.val == val){
//            if (head==tail){
//                head=null;
//                tail=null;
//            }else{
//                head = head.next;
//                tail.next = head;
//            }
//        return;
//        }
//
//        while (node.next!=head && node.next.val != val){
//            node = node.next;
//        }
//
//        if (node.next.val == val) {
//            if (node.next == tail) {
//                tail = node;
//            }
//            node.next = node.next.next;
//        }
        Node node = head;

        if (node==null){
            return;
        }

        if (node.val == val){
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        do {
            Node n = node.next;

            if (n.val ==val){
                node.next = n.next;

                if (n == tail) {
                    tail = node;
                    tail.next = head;
                }
                break;
            }

            node = node.next;
        }while (node != head);
    }

    public void display(){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }


        Node temp = head;

        do {
            System.out.print(temp.val+" ->");
            temp = temp.next;
        }while (temp!=head);
    }

    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
}
