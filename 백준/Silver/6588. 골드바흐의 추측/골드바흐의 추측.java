import java.io.*;

public class Main {

    static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        primeNumberEratosthenesSieve();

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;

            int result = isPossible(n);

            if(result>0){
                bw.write(n+" = "+result+" + "+(n-result)+"\n");
            }else{
                bw.write("Goldbach's conjecture is wrong.");
            }
        }
        bw.flush();
    }

    public static int isPossible(int n){
        for(int i=1; i<=n/2; i++){
            int a = i;
            int b = n - i;
            if(prime[a] && prime[b]) return a;
        }
        return -1;
    }

    public static void primeNumberEratosthenesSieve() {
        prime = new boolean[1000001];

        // initialize
        for(int i=2;i<=1000000;i++) {
            prime[i] = true;
        }

        for(int i=2;i<=1000000;i++) {
            if(!prime[i]) continue; 

        
            for(int j=2*i;j<=1000000; j+=i) {
                prime[j] = false;
            }
        }
    }
}