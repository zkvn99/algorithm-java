import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        int[] lenArr = new int[K];
        long max = 0;
        for (int i = 0; i < K; i++) {
            lenArr[i] = Integer.parseInt(br.readLine());
            if (lenArr[i] > max) max = lenArr[i];
        }
        
        long left = 1; 
        long right = max; 
        long answer = 0;
        
        while (left <= right) {
            long mid = (left + right) / 2;
            
            long count = 0;
            for (int len : lenArr) {
                count += (len / mid);
            }
            
            if (count >= N) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println(answer);
    }
}
