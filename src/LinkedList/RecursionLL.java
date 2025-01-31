//package LinkedList;
//
//public class RecursionLL {
//    private Node head;
//    private Node tail;
//
//    private int size;
//
//    public RecursionLL(){
//        this.size = 0;
//    }
//
//    public void insertRec(int val,int index){
//        head = InsertRecursion(val,index,head);
//    }
//
//    public Node InsertRecursion(int val,int index,Node node){
//        if (index == 0){
//            Node temp = new Node(val,node);
//            size++;
//            return temp;
//        }
//
//        node.next = InsertRecursion(val,index--,node.next);
//        return node;
//    }
//
//    private class Node{
//
//
//        private int value;
//        private Node next;
//
//        public Node(int value){
//            this.value = value;
//        }
//
//        public Node(int value,Node next){
//            this.value = value;
//            this.next = next;
//        }
//
//    }
//
//    public void insertAtLast(int val){
//        if(tail == null){
//            insertAtFirst(val);
//            return;
//        }
//
//        LL.Node node = new LL.Node(val);
//        tail.next = node;
//        tail = node;
//        size++;
//    }
//
//    public void insertAtFirst(int val){
//        LL.Node node = new LL.Node(val);
//        if (tail == null){
//            tail = head;
//        }
//
//        node.next = head;
//        head = node;
//        size++;
//    }
//
//}
