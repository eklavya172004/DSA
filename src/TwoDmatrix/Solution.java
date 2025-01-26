package TwoDmatrix;

class Solution {
    public static boolean search(int[][] search,int row,int cstart,int cend,int target){
        while (cstart<=cend){
            int mid  = cstart + ( cend - cstart )/2;

            if(search[row][mid] == target){
                return true;
            }

            if (search[row][mid] < target){
                cstart = mid+1;
            }else{
                cend = mid-1;
            }
        }

        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 1){
            return search(matrix,0,0,col-1,target);
        }

        int cmid = col/2;
        int rstart= 0;
        int rend =  row-1;

        while (rstart< (rend - 1 )){
            int rmid = rstart + ( rend-rstart )/2;

            if(matrix[rmid][cmid] == target){
                return true;
            }

            if(matrix[rmid][cmid] < target){
                rstart = rmid;
            }else{
                rend = rmid;
            }
        }

        if(matrix[rstart][cmid] == target){
            return true;
        }

        if(rstart+1 < row && matrix[rstart+1][cmid] == target){
            return true;
        }

        //check in first quad
        if( cmid-1 >= 0 && target <= matrix[rstart][cmid-1]){
            return search(matrix,rstart,0,cmid-1,target);
        }
        //check in 2nd quad
        if(cmid+1<col && target >= matrix[rstart][cmid + 1] && target <= matrix[rstart][col - 1]){
            return search(matrix,rstart,cmid+1,col-1,target);
        }
        //check in 3rd quad
        if( rstart+1 < row && cmid - 1 >= 0  && target <= matrix[rstart+1][cmid-1]){
            return search(matrix,rstart+1,0,cmid-1,target);
        }
        //check in 4th quad
        if (rstart + 1 < row && cmid + 1 < col && target >= matrix[rstart + 1][cmid + 1]) {
            return search(matrix, rstart + 1, cmid + 1, col - 1, target);
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] nums2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        Boolean bs = searchMatrix(nums2,25);
        System.out.println(bs);
    }
}