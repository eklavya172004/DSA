package Stack;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

//    @Override
//    public boolean insert(int val) throws StackException {
//        if (isFull()){
//            int[] temp = new int[data.length*2];
//
//            for (int i = 0; i < data.length; i++) {
//                temp[i] = data[(front + i)%data.length];
//            }
//
//            front = 0;
//            end = data.length;
//        }
//
//        return super.insert(val);
//    }
}
