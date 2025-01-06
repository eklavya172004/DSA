package Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
//        Subset("","abc");
//        int[] ans = {1,2,2};
//        Arraysubset(ans);
//        List<List<Integer>> list =   ArraysubsetDuplicate(ans);
//    System.out.print(list);
//        permutation()
        ArrayList<String> permutation = permutation("","abc");
        System.out.print(permutation);
    }

    static void Subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);

        Subset(p+ch,up.substring(1));
        Subset(p,up.substring(1));
//        Subset(p+(ch+0),up.substring(1));
    }

    static List<List<Integer>> Arraysubset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int i = 0; i < arr.length; i++) {
            int size = outer.size();
            for (int j = 0; j < size; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }

    static List<List<Integer>> ArraysubsetDuplicate(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;


            if(i>0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
                end = outer.size()-1;

            int size = outer.size();
            for (int j = start; j < size; j++) {


                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }

    static ArrayList permutation(String p,String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ArrayList<String> belowcall = permutation(f+ch+s,up.substring(1));
            list.addAll(belowcall);
        }
            return list;
    }


}
