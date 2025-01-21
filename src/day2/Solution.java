package day2;

class Solution {

    public static void main(String[] args) {
        int ans = lengthOfLongestSubstring("pwwkew");
        System.out.print(ans);
    }

    public static int lengthOfLongestSubstring(String s) {
        return length("",s);
    }

    public static int length(String p,String up){
        if(up.isEmpty()){
            return p.length();
        }

        char ch = up.charAt(0);
        int count = 0;

        if(p.contains(Character.toString(ch))){
            count += length(p,up.substring(1));
        }else{
            count += length(p+ch,up.substring(1));
        }
        return count;
    }
}