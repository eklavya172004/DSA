package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertAtFirst(23);
        list.insertAtFirst(24);
        list.insertAtFirst(25);
        list.insertAtFirst(26);
        list.insertAtLast(50);
        list.insertAtIndex(24,4);
//        list.deleteAtFirst();
////        list.deleteAtIndex(2);
//        list.deleteAtLast();
//        list.deleteAtLast();
//        list.deleteAtLast();
//        list.deleteAtIndex(1);
//        list.deleteAtLast();
        list.insertRec(55,5);
        list.display();

//        DL list2 = new DL();
//        list2.insertAtFirst(23);
//        list2.insertAtFirst(24);
//        list2.insertAtFirst(25);
//        list2.insertAtLast(26);
//        list2.insertAtLast(27);
//        list2.insertAtLastwhenHead(28);
//        list2.insertAtLastwhenHead(29);
//        list2.insertAtIndex(30,23);
//        list2.insertAtIndex(31,30);
//        list2.insertAtIndex(29,29);
//
//        list2.display();
//        CircularLL list = new CircularLL();
//        list.insert(23);
//        list.insert(24);
//        list.insert(25);
//        list.delete(24);
//        list.delete(25);
//        list.delete(23);
//        list.display();
    }
}
