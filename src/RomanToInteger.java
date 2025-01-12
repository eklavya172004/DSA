public class RomanToInteger {
    public static void main(String[] args) {
        int asn =  romanToInt("XII");
        System.out.print(asn);
    }


        static int value(char s) {
            switch (s) {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    return 0;
            }
        }
            static int romanToInt(String s) {
                int result = 0 ;


                for(int i = 0 ; i < s.length() ; i++){
                    int s1 = value(s.charAt(i));

                    if(i+1<s.length()){
                        int s2 = value(s.charAt(i+1));


                    if(s1>=s2){
                        result += s1;
                    }

                    if(s2>s1){
                        result += s2 - s1;
                        i++;
                    }
                    }else{
                        result += s1;
                    }
                }

                return result;
            }


}
