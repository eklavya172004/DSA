package Stack;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean insert(int val){
        if (isFull()){
            return false;
        }

        data[end] = val;
        end++;

        return true;
    }

    public int remove(){
        if (isEmpty()){
            System.out.println("Nothing to remove");
            return -1;
        }
        int val = data[0];

        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return val;
    }

    public void display(){

        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
