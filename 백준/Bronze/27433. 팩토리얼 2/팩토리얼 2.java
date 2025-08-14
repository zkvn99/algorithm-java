import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());
        System.out.print(factorial(N));
    }
    
    static long factorial(long n) {
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}