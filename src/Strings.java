public class Strings {
    public static void main(String[] args) {
        String name = "abcba";
        System.out.println(string(name));
    }

    static boolean string(String str){
        if(str == null || str.length() == 0){
            return true;
        }

        for(int i=0;i<=str.length()/2;i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            };
        }

        return true;
    }
}
