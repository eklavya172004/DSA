public class Sorting {
    public static void main(String[] args) {
        int[] nums = {5,4,2,3,1,6};
//        System.out.println(sort(nums));
        sort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    static void sort(int[] arr){
        int i = 0;

//        for(int i = 0 ; i<arr.length ; i++ ){
//            if( i == arr[i] - 1){
//
//            }
//        }
        while(i<arr.length) {

//            if (i == arr[i] - 1) {
//                i++;
//            }
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }
    }
}
