import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for (int i=0; i<N; i++) {
            int sum = i;
            int temp = i;
            while(temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
            
            if (sum == N) {
                System.out.print(i);
                return;
            }
        }
        
        System.out.print(0);
    }
}