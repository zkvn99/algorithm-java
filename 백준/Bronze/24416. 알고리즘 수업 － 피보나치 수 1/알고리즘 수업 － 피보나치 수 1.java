import java.util.*;
import java.io.*;

public class Main {
    
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        fib(n);
        sb.append(cnt).append(" ").append(n - 2);
        System.out.println(sb);
    }
    
    static int fib(int n) {
        if (n == 1 || n == 2) {
            cnt++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}