public class SubString {
    public static void main(String[] args) {
        String string = "abcdhsgf";

        printSubstring(string);
    }

    static void printSubstring(String sbs){
        for (int i = 0; i < sbs.length(); i++) {
            for (int j = i+1; j <= sbs.length() ; j++) {
                    System.out.println(sbs.substring(i,j));
            }
        }
    }
}
