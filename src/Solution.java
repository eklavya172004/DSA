import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,1}};

        int[][] ans = flipAndInvertImage(arr);
        for (int i = 0; i < ans.length; i++) {
//            for (int j = 0; j < ans.length; j++) {
                System.out.println(Arrays.toString(ans[i]));
//            }
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for(int i=0;i<image.length;i++){
            for(int j=0;j<(image[0].length+1)/2;j++){
                image[i][j] = image[i][j]^1;

                int temp = image[i][j];
                image[i][j] = image[i][image[0].length-1-j]^1;
                image[i][image[0].length-1-j] = temp;
            }
        }
        return image;
    }
}