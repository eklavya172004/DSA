package Stack;

import javax.management.StandardEmitterMBean;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int number) {
//        return super.push(number);
        if (isFull()){
            int[] temp = new int[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        ptr++;
        data = temp;

        }
        return super.push(number);
    }

    public int size(){
        return data.length;
    }
}
