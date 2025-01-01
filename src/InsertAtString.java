public class InsertAtString {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int chars[] = { 1, 5, 7, 9 };

        String ans = addChar(str, chars);

        System.out.println(ans);
    }

    static String addChar(String s,int[] arr){
        String ans = "";
        int j = 0;

        for (int i = 0; i < s.length() ; i++) {
            if( j< arr.length &&  i == arr[j]){
                ans += "*";
                j++;
            }

            ans += s.charAt(i);
        }

        return ans;
    }
}
