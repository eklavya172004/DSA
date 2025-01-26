package LinkedList;

import javax.swing.*;

public class LL {
        private Node head;
        private Node tail;

        private int size;

        public LL(){
            this.size = 0;
        }

        public void insertAtLast(int val){
            if(tail == null){
                insertAtFirst(val);
                return;
            }

            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }

        public void insertAtFirst(int val){
            Node node = new Node(val);
            if (tail == null){
                tail = head;
            }

            node.next = head;
            head = node;
            size++;
        }

        public void insertAtIndex(int val,int index){
            if (index>size){
                throw new RuntimeException("Cannot insert at large index");
            }

            if(index ==0 ){
                insertAtFirst(val);
                return;
            }

            if (index == size){
                insertAtLast(val);
                return;
            }

            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            Node node = new Node(val,temp.next);
            temp.next = node;
            size++;
        }

        //delete
        public int deleteAtFirst(){
            int val = head.value;

            head = head.next;

            if (head == null){
                tail = null;
            }

            size--;
            return val;
        }

        public int deleteAtLast(){
            if (size<=1){
                return deleteAtFirst();
            }

            Node secondlast = get(size-2);
            int val = tail.value;
            tail = secondlast;
            tail.next = null;

            size--;

            return val;
        }

        public int deleteAtIndex(int index){
            if(index == 0){
                return deleteAtFirst();
            }

            if (index == size - 1){
               return deleteAtLast();
            }

            Node prev = get(index-1);

            int val = prev.next.value;

            prev.next = prev.next.next;

            size--;
            return val;
        }

        public Node get(int index){
            Node node = head;

            for (int i = 0; i < index; i++) {
                node = node.next;
            }

            return node;
        }

    public Node find(int value){
            Node node = head;

            while (node!=null){
                if (node.value == value){
                    return node;
                }
                    node = node.next;
            }

            return null;
    }

        public void display(){
            Node temp = head;

            while (temp!=null){
                System.out.print(temp.value+" -> ");
                temp = temp.next;
            }

            System.out.println("End");
        }

    private class Node{


        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }
}
