class Reverse {
    public static int reverse(int x) {
        int y = 0;
        boolean neg = false;

        if(x<0){
            x = -x;
            neg = true;
        }

        while(x>0){
        int digit = (int)Math.log10(x)+1;
        int val = x % 10;
        int n = digit - 1;

        if((y>Integer.MAX_VALUE/10) || y<Integer.MIN_VALUE/10){
            return 0;
        }
        y  = y*10+val;

        x = x/10;
        }

        if (neg){
            y = -y;
        }

        return y;
    }

    public static void main(String[] args) {
        int ans = reverse(-123);
        System.out.println(ans);
    }
}