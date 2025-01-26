class Unique {
    public static int firstUniqChar(String s) {
        if (s.isEmpty()){
            return -1;
        }

        char ch = s.charAt(0);

        if(s.substring(1).contains(Character.toString(ch))){
            return firstUniqChar(s.substring(1));
        }

        return s.indexOf(ch);
    }

    public static void main(String[] args) {
        int a = firstUniqChar("aabb");
        System.out.println(a);
    }
}