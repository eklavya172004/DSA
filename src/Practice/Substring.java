package Practice;

import java.util.ArrayList;

public class Substring {
    public static void main(String[] args) {
//            String ans = "abccsa";
//            remove("","abccsa");
    ArrayList<String> ans = remove("","abcdaaaaaaaaaaaaaaaaaergfrfr");
    System.out.print(ans);
    }

    static void remove2(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            remove2(p,up.substring(1));
        }else{
              remove2( p+ch,up.substring(1));
        }
    }

    static ArrayList remove(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
//            System.out.println(p);
            return list;
        }
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        char ch = up.charAt(0);

        if(ch == 'a'){
            list1 = remove(p,up.substring(1));
        }else{
            list2 = remove( p+ch,up.substring(1));
        }
        list.addAll(list1);
        list.addAll(list2);

        return list;
    }
}
