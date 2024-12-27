import java.util.EnumMap;

public class PrimeNUmber {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
    System.out.println("is "+ i + " prime?" + number(i));
        }
    }

    static boolean number(int n ){
        if(n<=1){
            return false;
        }

//        for(int i=2; i <= Math.sqrt(n);i++){
//        if(n%i ==0){
//            return false;
//        }
//        }
        int c = 2;

        while(c*c<=n){
            if(n%c == 0) {
                return false;
            }
            c++;
        }

        return true;
    }
}
