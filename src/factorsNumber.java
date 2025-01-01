import java.util.ArrayList;

public class factorsNumber {
    public static void main(String[] args) {
        factors2(20);
    }

    static void factors1(int n){

        for (int i = 0; i <= n ; i++) {
            if(n % i == 0){
                System.out.println(i + " ");
            }
        }
    }

    //O(sqrt(n))

    static void factors2(int n){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i*i <= n ; i++) {
            if(n % i == 0){
//                System.out.println(i + " ");
                if( n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i+ " ");
                    list.add(n/i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.print(list.get(i)+ " ");
        }
    }

}
