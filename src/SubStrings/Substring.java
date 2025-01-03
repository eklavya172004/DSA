package SubStrings;

import java.util.ArrayList;
import java.util.Arrays;

public class Substring {
    public static void main(String[] args) {
        ArrayList<String> ans = Asciistring("","abc");
//        subseq("","abc");

//        subseqAscii("","ab");
        System.out.print(ans);
    }

    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

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

    static void subseqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p+(ch+0),up.substring(1));
    }

    static ArrayList<String> Asciistring(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String>  left = Asciistring(p+ch,up.substring(1));
//        ArrayList<String>  middle = Asciistring(p+(ch+0),up.substring(1));
        ArrayList<String>  right = Asciistring(p,up.substring(1));
        ArrayList<String>  middle = Asciistring(p+(ch+0),up.substring(1));

        left.addAll(right);
        left.addAll(middle);

        return left;
    }
}
