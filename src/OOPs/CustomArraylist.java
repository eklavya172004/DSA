package OOPs;

public class CustomArraylist<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0 ;

    public CustomArraylist(){
        this.data = new Object[DEFAULT_SIZE];
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

        CustomArraylist<String> list2 = new CustomArraylist<>();
        list2.add("ded");
        list2.add("dedede");
        list2.add("edededededed");

        for (int i = 0; i < list2.size; i++) {
            System.out.print(list2.get(i)+" ");
        }
    }
}


