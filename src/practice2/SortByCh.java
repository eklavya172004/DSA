package practice2;

public class SortByCh {
    public static void main(String[] args) {
        frequencySort("treep");
    }

//    class Solution {
        public static String frequencySort(String s) {
            return sort("","",s);
        }

        public static String sort(String p,String unique,String up){
            if(up.isEmpty()){
                System.out.println(p);
                return p;
            }

            char ch = up.charAt(0);


            if(p.contains(String.valueOf(ch))){
                    unique  = addcharAt(p,ch);

                sort(unique,unique,up.substring(1));
            }else{
                sort(unique + ch + p,unique,up.substring(1));
            }

            return "";
        }

        public static String addcharAt(String str,char c){
            StringBuffer stringBuffer = new StringBuffer(str);

            stringBuffer.insert(0,c);

            return stringBuffer.toString();
        }

}
