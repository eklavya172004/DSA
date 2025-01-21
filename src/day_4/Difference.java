package day_4;

class Difference {
    public static void main(String[] args) {
        char ch = findTheDifference("abcd","abcde");
        System.out.print(ch);
    }

    public static char findTheDifference(String s, String t) {
        char result = 0;

        for (int i = 0 ; i < s.length() ; i++){
            result ^= s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }

        return result;
    }
}