package Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
        String s1 = "abcdxabcde";
        String s2 = "abcdeabcdx";

        ArrayList<String> list  = Permutation("",s1);
        for (int i = 0; i < list.size(); i++) {
            if(s2.contains(list.get(i))){
                System.out.print(true);
            }
        }
    }

    public static ArrayList<String> Permutation(String p , String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ArrayList<String> callfrombelow = Permutation(f+ch+s,up.substring(1));
            list.addAll(callfrombelow);
        }

        return list;
    }
//    static String Permutation(String p ,String up){
//        StringBuilder str = new StringBuilder();
//        if(up.isEmpty()){
//            str.append(p);
//            return str.toString();
//        }
//
//        char ch = up.charAt(0);
//
//        for(int i = 0; i <= p.length();i++){
//            String f = p.substring(0,i);
//            String s = p.substring(i,p.length());
//            String frombelow = Permutation(f+ch+s,up.substring(1));
//            str.append(frombelow);
//        }
//        return str.toString();
//    }
}
