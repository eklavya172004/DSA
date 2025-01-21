package PhonePad;

import java.util.Arrays;

public class LetterCombination2 {
    public static void main(String[] args) {
        int ans = minimumSort("xyzxyzxyzxyz");
        System.out.print(ans);
    }

//    class Solution {
        public static int minimumPushes(String word) {
            int count = 0 ;
            int assign = 2 ; //it will take the word count
            int[] freq = new int[10];

            for (int i = 0; i < word.length(); i++) {

                if(assign>9){
                    assign=2;
                }

                freq[assign]++;
                count += freq[assign];
                assign++;
            }

            return count;
        }

        public static int minimumSort(String word){
            int[] charf = new int[26];

            for (char ch : word.toCharArray()){
                charf[ch - 'a']++;
            }

            Arrays.sort(charf);
            //chatgpt explaination
            int totalways = 0 ;
            int press =1;
//            int[] freq = new int[10];

            for (int i = 25; i >=0  ; i--){
                int ch = charf[i];

                if(ch>0){
                    totalways += charf[i]*press;
                }
                if((25-i+1) % 9 == 0){
                    press++;
                }
            }

            return totalways;
        }
//    }
}