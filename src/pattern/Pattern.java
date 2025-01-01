package pattern;

public class Pattern {
    public static void main(String[] args) {
        patter3(5);
    }

    static void patter1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //numbers
    static void patter2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void patter3(int n){
            int k = 0;
        for (int i = 0; i < 2*n - 1; i++) {
            for (int j = 0; j <= k; j++) {
                System.out.print("*");
            }
            if(i>=4){
                k--;
            }else{
                k++;
            }
            System.out.println();
        }
    }
}
