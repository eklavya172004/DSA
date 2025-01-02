public class PracticeRecursion {
    public static void main(String[] args) {
        int[] ans = {1,2,3,4,5};
        pattern(ans);
    }

    static void pattern(int[] ans){

        if(ans.length < 1 ) return;

        int sum = 0;

        int[] array = new int[ans.length-1];

        for (int i = 0; i < ans.length-1 ; i++) {
            sum = ans[i+1] + ans[i];
//            System.out.print(sum + " ");
            array[i] = sum;
        }


        pattern(array);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
            System.out.println();

//        pattern(ans,r-1,0);
    }
}
