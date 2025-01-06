public class Sieve {
    public static void main(String[] args) {
        int n = 10;
        boolean[] primes = new boolean[n+1];
        int ans = sieve(n,primes);
        System.out.print(ans);
    }
//false in array means number is prime
    static int sieve(int n, boolean[] primes){
        int count = 0;
        for( int i=2;i*i<=n;i++){
            if(!primes[i]){
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.println(i);
                count++;
            }
        }
   return count;
    }

}
