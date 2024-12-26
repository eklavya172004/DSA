import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
            int[][] nums = {
                    {10,20,30,40},
                    {15,25,35,45},
                    {28,29,37,49},
                    {33,34,38,50}
            };
            int target = 100;
//            int[] ans = search(nums,target);

        int[][] nums2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int[][] num3 = {{1}};

        int[] ans = sortedsearch(num3,1);
            System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int target){
        int s = 0;
        int e = arr.length - 1;

        while(s < arr.length && e >= 0){
            if(arr[s][e] == target){
                return new int[]{s,e};
            }

            if(arr[s][e] < target){
                s++;
            }else{
                e--;
            }
        }

        return new int[]{-1,-1};
    }

    static int[] binarysearch(int[][] arr, int row , int cstart,int cend,int target){
        while(cstart<=cend){

            int mid = cstart + (cend-cstart)/2;
            if(arr[row][mid] == target){
                return new int[]{row,mid};
            }

            if(arr[row][mid] < target){
                cstart = mid+1;
            }else{
                cend = mid-1;
            }
        }

        return new int[]{-1,-1};
    }

    static int[] sortedsearch(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Handle the case for a single row matrix
        if (rows == 1) {
            return binarysearch(arr, 0, 0, cols - 1, target);
        }

        int cmid = cols / 2;
        int rstart = 0;
        int rend = rows - 1;

        // Binary search on the central column
        while (rstart < (rend - 1)) { // While more than two rows remain
            int rmid = rstart + (rend - rstart) / 2;

            if (arr[rmid][cmid] == target) {
                return new int[]{rmid, cmid};
            }

            if (arr[rmid][cmid] > target) {
                rend = rmid;
            } else {
                rstart = rmid;
            }
        }

        // Check in the middle column of the two remaining rows
        if (arr[rstart][cmid] == target) {
            return new int[]{rstart, cmid};
        }
        if ( arr[rstart + 1][cmid] == target) {
            return new int[]{rstart + 1, cmid};
        }

        // Search in 1st quadrant (top-left)
        if (target <= arr[rstart][cmid - 1]) {
            return binarysearch(arr, rstart, 0, cmid - 1, target);
        }
        // Search in 2nd quadrant (top-right)
        if (target >= arr[rstart][cmid + 1] && target <= arr[rstart][cols - 1]) {
            return binarysearch(arr, rstart, cmid + 1, cols - 1, target);
        }

        // Search in 3rd quadrant (bottom-left)
        if (target <= arr[rstart + 1][cmid - 1]) {
            return binarysearch(arr, rstart + 1, 0, cmid - 1, target);
        }
        // Search in 4th quadrant (bottom-right)
        return binarysearch(arr, rstart + 1, cmid + 1, cols - 1, target);
    }
}
