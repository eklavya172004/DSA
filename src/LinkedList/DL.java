package LinkedList;

public class DL {
    private Node head;
    private Node tail;
    private int size;

    public DL(){
        this.size = 0;
    }

    public void insertAtFirst(int value){

        Node node = new Node(value);
        node.next = head;
        node.prev = null;

        if(head != null){
        head.prev = node;
        }

        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertAtLast(int value){
        if (tail == null){
            insertAtFirst(value);
            return;
        }

        Node node = new Node(value);
        node.prev = tail;
        tail.next = node;
        node.next = null;
        tail = node;

        size++;
    }

    public void insertAtLastwhenHead(int value){
        Node node = new Node(value);
        node.next = null;

        if (head == null){
            node.prev = null;
            head = node;
            return;
        }

        Node last = head;

        while (last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;

        size++;
    }

    public void insertAtIndex(int value,int after){

//        if (index == 0){
//            insertAtFirst(value);
//            return;
//        }
//
//        if (index == size-1){
//            insertAtLast(value);
//            return;
//        }


        Node secondLast = find(after);

        if (secondLast == null){
            System.out.println("doesn't exist");
            return;
        }

        Node node = new Node(value);
        //secondlast is previous
        node.next = secondLast.next;
        secondLast.next = node;
        if (node.next!=null){
        node.next.prev = node;
        }
        node.prev = secondLast;

        size++;
    }

    public Node find(int value){
        Node node = head;

        while (node != null){
            if (node.val == value){
                return node;
            }
            node = node.next;
        }

        return null;
    }

    public Node get(int index){
        Node node = head;

        for (int i = 0; i < index; i++) {
                node = node.next;
        }

        return node;
    }

    public void display(){
        Node temp = head;
        Node last = null;

        while (temp != null){
            System.out.print(temp.val+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("IN REVERSE ORDER");

//        while (last!=null){
//            System.out.print(last.val+" -> ");
//            last = last.prev;
//        }
//
//        System.out.println();
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int value){
            this.val = value;
        }

        public Node(int value,Node next,Node prev){
            this.val = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
