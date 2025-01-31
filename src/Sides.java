import java.util.ArrayList;
import java.util.Arrays;

public class Sides {
    public static int solve(ArrayList<Integer> A, int B) {
        int a = 0;
        int b = A.size()-1;
        int sum = 0 ;
        int count = 0 ;

        while (a<b && count < B){
            if (A.get(a)>A.get(b)){
                sum += A.get(a);
                if (A.get(a)>0){
                    a++;
                }
            }else{
                sum += A.get(b);
                if (A.get(b)>0){
                    b--;
                }
            }

            count++;
        }

        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        int sum = solve(a,1);
        System.out.println(sum);
    }
}
