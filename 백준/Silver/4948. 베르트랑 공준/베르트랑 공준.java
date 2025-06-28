import java.util.*;
import java.io.*;

public class Main {
    static final int MAX = 246912;
    static boolean[] isNotPrime = new boolean[MAX + 1];
    public static void main(String[] args) throws IOException {
        sieve();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            
            int cnt = 0;
            for (int i = n + 1; i <= n * 2; i++) {
                if (!isNotPrime[i]) {
                    cnt++;
                }
            }
            
            System.out.println(cnt);
        }
    }
    
    static void sieve() {
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        
        for (int i = 2; i * i <= MAX; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }
}