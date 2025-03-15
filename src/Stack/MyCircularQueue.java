package Stack;

class MyCircularQueue {
    protected int[] data;
    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public MyCircularQueue(int k) {
        this.data = new int[k];
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        data[end] = value;
        end++;

        end = end % data.length;

        size++;

        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        front++;
        front = front % data.length;
        size--;

        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }

        return data[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        return data[(end-1+data.length) % data.length];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }


    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(3);
        boolean param_1 = obj.enQueue(1);
        boolean param_2 = obj.enQueue(2);
        boolean param_3 = obj.enQueue(3);
        boolean param_4 = obj.enQueue(4);
        int param_5 = obj.Rear();
        boolean param_6 = obj.isFull();
        boolean param_7 = obj.deQueue();
        boolean param_8 = obj.enQueue(4);
        int param_9 = obj.Rear();
//        int param_3 = obj.Front();
//        boolean param_5 = obj.isEmpty();
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
        System.out.println(param_5);
        System.out.println(param_6);
        System.out.println(param_7);
        System.out.println(param_8);
        System.out.println(param_9);
    }
}
/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */