package Heap;

import java.util.ArrayList;

public class HeapRevision<T extends Comparable<T>>{

    private ArrayList<T> list;

    public HeapRevision(){
        list = new ArrayList<>();
    }

    private void swap(int first,int second){
        T temp = list.get(first);
        list.set(first,list.get(second)) ;
        list.set(second,temp);
    }

    private int parent(int index){
        return (index - 1)/2;
    }

    private int left(int index){
        return 2*(index) + 1;
    }

    private int right(int index){
        return 2*(index) + 2;
    }

    //insertion

    public void insert(T value){
        list.add(value);

        upheap(list.size()-1);
    }

    private void upheap(int i) {
        if (i == 0 ){
            return;
        }

        int p = parent(i);

        //this signifies that if index is smaller than parent than swap
        if (list.get(i).compareTo(list.get(p))<0){
            swap(p,i);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if (list.isEmpty()){
            throw new Exception("Removing from an empty heap!");
        }

        T temp = list.get(0);

        T last = list.remove(list.size()-1);

        if (!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }

        return temp;
    }

    private void downheap(int i) {
        int min = i;
        int left = left(i);
        int right = right(i);

        if (left<list.size() && list.get(min).compareTo(list.get(left))>0){
              min = left;
        }

        if (right<list.size() && list.get(min).compareTo(list.get(right))>0){
            min = right;
        }

        if (min!=i){
            swap(min,i);
            downheap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception{

            ArrayList<T> data = new ArrayList<>();

            while (!list.isEmpty()){
                data.add(this.remove());
            }

            return data;
    }
}
