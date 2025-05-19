package HashMap;

public class KrapRobin {
    private final int PRIME = 101;

    private double calculateHash(String str){
        long hash = 0;

        for (int i = 0; i < str.length(); i++) {
            hash = (long) (hash + str.charAt(i)*Math.pow(PRIME,i));  //hash = 97*101^0 + 98*101^1 + 99*101^2
        }
        return hash;
    }

    private long updateHash(long prevHash,char oldchar,char newchar,int patternlength){
            long newHash = (prevHash - oldchar) / PRIME;

            newHash += (long) (newchar * Math.pow(PRIME,patternlength-1));

            return newHash;
    }

    public void search(String text,String pattern){
        int patternLength = pattern.length();
        long patternHash = (long) calculateHash(pattern);
        long textHash = (long) calculateHash(text.substring(0,patternLength));

        for (int i = 0; i < text.length()- patternLength; i++) {
            if (textHash == patternHash){
                if (text.substring(i,i+patternLength).equals(pattern)){
                    System.out.println("You have found the answer!! "+ i);
                }
            }

            if (i<text.length()- patternLength){
                textHash = updateHash(textHash,text.charAt(i),text.charAt(i+patternLength),patternLength);
            }
        }
    }
}
