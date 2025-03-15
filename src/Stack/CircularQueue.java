package Stack;

public class CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int first = 0;
    protected int end = 0;
    private int size = 0;

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean insert(int val) throws StackException{
        if (isFull()){
            throw new StackException("Its full");
        }

        data[end] = val;
        end++;

        end = end%data.length;
        size++;
        return true;
    }

    public int remove() throws StackException{
        if (isEmpty()){
            throw new StackException("It's empty");
        }

        int remove = data[first];
        first++;
        first = first%data.length;
        size--;
        return remove;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        int i = first;
        int count = 0;

        while (count < size) {
            System.out.print(data[i] + " ");
            i = (i + 1) % data.length;  // Move circularly
            count++;
        }
        System.out.println();
    }

    public int front() throws StackException{
        if (isEmpty()){
            throw new StackException("khaali hai");
        }

        return data[end];
    }
}
