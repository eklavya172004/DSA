package permutation;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
//        ArrayList<String> ans = permutation2("","abc");
//        System.out.println(ans);
        System.out.print(permutation2("","abcd"));
    }

    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));
        }
    }

    static ArrayList permutation2(String p, String up){
        //local to this call
            ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ArrayList<String> ansfrombelowcall =  permutation2(f+ch+s,up.substring(1));
            list.addAll(ansfrombelowcall);
        }

        return list;
    }

    static int permutationCount(String p,String up){
        if(up.isEmpty()){
//            System.out.println(p);
            return 1;
        }
        int count = 0;

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count =  count +  permutationCount(f+ch+s,up.substring(1));
        }

        return count;
    }
}
