import java.util.*;
import java.io.*;

public class Main {
    static final int MAX = 1000000;
    static boolean[] isNotPrime = new boolean[MAX + 1];

    public static void main(String[] args) throws IOException {
        sieve();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(countGoldbachPairs(num));
        }
    }
    
    static int countGoldbachPairs(int n) {
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if(!isNotPrime[i] && !isNotPrime[n - i]) {
                count++;
            }
        }
        return count;
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