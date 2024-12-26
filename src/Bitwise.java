public class Bitwise {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,3,4,2,3,4,5};
        Find(arr);
        System.out.println(Find(arr));
    }

    private static int Find(int[] arr){
        int result = 0;

        for(int i = 0 ; i < 32 ;i++){
//            sum += (arr[i] >> i) & 1 ;

            int sum = 0;

            for(int num = 0; num<arr.length; num++){
                sum += (arr[num]>>i) & 1;
            }

            sum %= 3;

            result |= (sum << i); // we are updating the result
        }
    return result;
    }
}
