package Heap.Practice;

import java.util.ArrayList;

public class Heap <T extends Comparable<T>>{

    private ArrayList<T> list;

    public Heap(){
        this.list = new ArrayList<>();
    }

    public void swap(int first,int second){
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    public int parent(int i){
        return i/2;
    }

    public int left(int i) {
        return 2*i+1;
    }

    public int right(int i){
        return 2*i+2;
    }

    public void insert(T value){
        list.add(value);

        upheap(list.size()-1);
    }

    private void upheap(int i) {
        if (i == 0 ){
            return;
        }

        int p = parent(i);

        if (list.get(i).compareTo(list.get(p))<0){
            swap(p,i);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if (list.isEmpty()){
            throw new Exception("List is empty");
        }

        T temp = list.get(0);
        T remove = list.remove(list.size()-1);

        if (!list.isEmpty()){
            list.set(0,remove);
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

        if (min != i){
            swap(i,min);
            downheap(min);
        }
    }
}
