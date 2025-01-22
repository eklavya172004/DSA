package OOPs;

import java.util.Arrays;
import java.util.List;

//here T should be either number or its subclasses
public class WildCard<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0 ;

    public WildCard(){
        this.data = new Object[DEFAULT_SIZE];
    }

    //this is wildcard
    public void getList(List<? extends Number>list){
        //do something
        for (Number num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
        //here you can only pass number type
    }

    public void add(T num){
        if(isFull()){
           resize();
        }

        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];

        for (int i = 0; i< data.length ; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        //Since generics only work at compile-time and the runtime doesn't know the actual type, explicit casting is needed.
        //This ensures that the returned value matches the type that was originally stored in the list.
        T remove = (T)data[--size];
        return remove;
    }

    public T get(int index){
        return (T)data[index];
    }

    public void set(int index,T value){
        data[index] = value;
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
//        CustomArraylist list = new CustomArraylist();
//        for (int i = 0; i < 11; i++) {
//            list.add(i);
//        }
//
//        list.remove();

//        for (int i = 0; i < list.size; i++) {
//            System.out.print(list.get(i)+" ");
//        }

//        list.add(10);

//
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);

        WildCard<Number> wc = new WildCard<>();
        wc.getList(intList);  // Valid
//        wc.getList(doubleList);  // Valid
    }
}


