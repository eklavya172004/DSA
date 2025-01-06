import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        int ans = dice("",4);
//        System.out.print();
        ArrayList<String> ans =  dice("",4);
        System.out.print(ans);
    }

    static ArrayList<String> dice(String p,int target){
        ArrayList<String> list = new ArrayList<>();

        if(target == 0){
            list.add(p);
//            System.out.println(p);
            return list;
        }

//        int count = 0;
        for(int i = 1; i < 6 && i <= target; i++){
            ArrayList<String> ans = dice(p+i,target-i);
            list.addAll(ans);
        }
        return list;
    }
}
