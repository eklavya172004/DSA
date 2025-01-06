package PhonePad;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> list =  pad("","12");
//        System.out.print(list);
        int count = padcount("","12");
        System.out.print(count);
    }

    static ArrayList pad(String p, String up){
            ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
//            System.out.println(p);
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);

            ArrayList<String> ansfrombelow =  pad(p+ch,up.substring(1));
            list.addAll(ansfrombelow);
        }

        return list;
    }

    static void pad2(String p, String up){
//        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            System.out.println(p);
//            list.add(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);

            pad2(p+ch,up.substring(1));
//            list.addAll(ansfrombelow);
        }
    }

//count
    static int padcount(String p, String up){
//        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
//            System.out.println(p)
            return 1;
        }

        int digit = up.charAt(0) - '0';
        int count = 0;
//if count will go outside for each recursive call it will not start with 0 but from the previous recursive call stored value of count
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);

            count += padcount(p+ch,up.substring(1));
        }

        return count;
    }

//        return list;
}
