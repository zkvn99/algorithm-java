import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        while (N > 1) {
            for (int i=2; i<=N; i++) {
                if (N % i == 0) {
                    N = N / i;
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}