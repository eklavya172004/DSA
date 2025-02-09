package LinkedList;

public class ReverseNode {
    public static void main(String[] args) {

    }

    private class Node{


        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

    public Node reverseBetween(Node head, int k) {
        if(k<=1 || head == null){
            return head;
        }

        Node current = head;
        Node prev = null;

        while (true){

        Node last  = prev;
        Node newEnd  = current;

        for(int i = 0 ;current !=null && i < k;i++){
            Node nex = current.next;
            current.next = prev;
            prev = current;
            current = nex;
        }

        if(last!=null){
            last.next = prev;
        }else{
            head = prev;
        }

        newEnd.next = current;

        if (current == null){
            break;
        }

        prev = newEnd;
        }
        return head;

    }

    public Node reverseAlternate(Node head, int k) {
        if(k<=1 || head == null){
            return head;
        }

        Node current = head;
        Node prev = null;

        while (current!=null){

            Node last  = prev;
            Node newEnd  = current;

            for(int i = 0 ;current !=null && i < k;i++){
                Node nex = current.next;
                current.next = prev;
                prev = current;
                current = nex;
            }

            if(last!=null){
                last.next = prev;
            }else{
                head = prev;
            }

            newEnd.next = current;

//            if (current == null){
//                break;
//            }
//
//            prev = newEnd;

            //skip the k nodes
            for (int i = 0;current!=null && i < k; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;

    }
}
