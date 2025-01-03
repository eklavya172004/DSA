import java.util.ArrayList;
import java.util.Arrays;

class BeautySum {
    public static void main(String[] args) {
        ArrayList<String> list = arraySubstring("","aabcb");
        System.out.print(list);
    }

//    public int beautySum(String s) {
//        return
//    }

    static ArrayList<String> arraySubstring(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String>  left = arraySubstring(p+ch,up.substring(1));
        ArrayList<String>  right = arraySubstring(p,up.substring(1));

        left.addAll(right);

        return left;
    }
}