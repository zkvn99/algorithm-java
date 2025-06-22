import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());
            System.out.println(findPrime(num));
        }
    }
    
    static long findPrime(long num) {
        while (true) {
            if(chkPrime(num)) {
                break;
            } 
            num++;
        }
        
        return num;
    }
    
    static boolean chkPrime(long num) {
        if (num < 2) return false;
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) { 
                return false;
            }
        }
        
        return true;
    }
}