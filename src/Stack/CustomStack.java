package Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack(int size){
        this.data = new int[size];
    }

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public boolean push(int number){
        if (isFull()){
            System.out.println("Cannot be inserted");
            return false;
        }

        ptr++;
        data[ptr] = number;
        return true;
    }

    public int pop() throws StackException{
        if (isEmpty()){
            throw new StackException("Cannot pop from the empty stack");
        }

        int removed = data[ptr];
        ptr--;

        return removed;
    }

    public int peek() throws StackException{
        if(isEmpty()){
//            System.out.println("Nothing to see!!");
            throw new StackException("Nothing to see!!");
        }

        return data[ptr];
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(20);
        stack.push(12);
        stack.push(13);
        stack.push(14);

//        System.out.println(stack.pop());
//
////        System.out.println(stack.pop());
//        System.out.println(stack.pop());
////        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//
//

//        DynamicStack ds = new DynamicStack();
//        for (int i = 0; i < 12; i++) {
//            ds.push(i);
//        }
//
//        System.out.println(ds.size());

//        CustomQueue que = new CustomQueue();
//        que.insert(12);
//        que.insert(13);
//        que.insert(14);
//        que.insert(15);
//        que.display();
//        que.remove();
//        que.remove();
//        que.insert(16);
//        que.display();
        CircularQueue cir = new CircularQueue();
        cir.insert(112);
        cir.insert(111);
        cir.insert(133);
        cir.insert(144);
        cir.display();
        cir.remove();
        cir.remove();
        cir.display();
        cir.insert(12);
        cir.display();
    }
}
