public class SkipCharacter {
    public static void main(String[] args) {
        String name = "abcd";
        String result = SkipCharcater(name);
        System.out.print(result);
    }

//    static String removeCharacter(String str,char c){
//        if(str.isEmpty()) return " ";
//
//        char firstchar = str.charAt(0);
//
//        if(firstchar == c) return removeCharacter(str.substring(1),c);
//        else return firstchar + removeCharacter(str.substring(1),c);
//    }

    static void Skip(String p,String up){
        if(up.isEmpty()){
            System.out.print(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch == 'a')  Skip(p,up.substring(1));
        else  Skip(p+ch,up.substring(1));

    }

    static String SkipCharcater(String p){
        if(p.isEmpty()) return " ";

        char ch = p.charAt(0);

        if(ch == 'a'){
            return SkipCharcater(p.substring(1));
        }
        else{
            return ch + SkipCharcater(p.substring(1));
        }
    }
}
