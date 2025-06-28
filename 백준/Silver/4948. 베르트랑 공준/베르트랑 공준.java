import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            
            if (n == 0) {
                return;
            }
            
            System.out.println(primeCnt(n));
        }
    }
    
    static int primeCnt(int num) {
        int max = num * 2;
        int cnt = 0;
        num++;
        
        while (num <= max) {
            boolean primeChk = true;
        
            for (int i = 2; i*i <= num; i++) {
                if (num % i == 0) {
                    primeChk = false;
                    break;
                }
            }
            
            if (num < 2) {
                primeChk = false;
            }
            
            if (primeChk) cnt++;
            num++;
        }
        
        return cnt;
    }
}