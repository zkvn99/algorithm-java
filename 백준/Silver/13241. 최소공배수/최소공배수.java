import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int max = Math.max(A, B);
        int min = Math.min(A, B);
        System.out.print((long) A * B / gcd(max, min));
    }
    
    static int gcd(int a, int b) {
        int r = 0;
        
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        
        return a;
    }
}