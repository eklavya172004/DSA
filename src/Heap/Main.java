package Heap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<Integer>();
        heap.insert(23);
        heap.insert(33);
        heap.insert(22);
        heap.insert(99);
//
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());

        HeapRevision<Integer> list = new HeapRevision<Integer>();
        list.insert(20);
        list.insert(23);
        list.insert(89);
        list.insert(90);
        list.insert(66);
        list.insert(44);
        list.insert(81);
        list.insert(92);
        list.insert(56);
        list.insert(12);

//        System.out.println(list.remove());
//        System.out.println(list.remove());
//        System.out.println(list.remove());
        ArrayList listsort = list.heapSort();
        System.out.println(listsort);
    }
}
