import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int diff = arr[1] - arr[0];
        
        for (int j = 2; j < N; j++) {
            diff = gcd(diff, arr[j] - arr[j - 1]);
        }
        
        int result = (arr[N - 1] - arr[0]) / diff - N + 1;
        System.out.print(result);
    }
    
    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        
        return a;
    }
}