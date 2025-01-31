import LinkedList.LL;

import java.util.LinkedList;

class Happy {
    public static void main(String[] args) {
        boolean list = isHappy(12);
        System.out.println(list);
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
        slow = findsquare(slow);
        fast = findsquare(findsquare(fast));
        }while (slow!=fast);

        if (slow==1){
            return true;
        }

        return false;
    }

    private static int findsquare(int n){
        int sum1 = 0;

        while(n>0){
            int sum = n % 10;
            sum1 += sum*sum;
            n /= 10;
        }

        return sum1;
    }
}

//    private class Node{
//
//        private int value;
//        private Node next;
//
//        public Node(int value){
//            this.value = value;
//        }
//
//        public Node(int value, Node next){
//            this.value = value;
//            this.next = next;
//        }
//}