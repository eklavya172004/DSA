package binerysearch;

class Solution {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};

        int ans = shipWithinDays(num,3);
        System.out.println(ans);
    }

    public static int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end  = 0;

        for(int i=0;i< weights.length;i++){
            start = Math.max(weights[i],start);
            end += weights[i];
        }

        while(start<end){
            int mid = start + (end-start)/2;
            int pieces = 1;
            int sum = 0;

            for(int j = 0 ; j < weights.length ; j++){

                if( sum + weights[j] > mid){
                    sum = weights[j];
                    pieces++;
                }else{
                      sum += weights[j];
                }
            }

            if(pieces > days){
                start = mid + 1;
            }else{
                end = mid;
            }
        }

        return end;
    }
}