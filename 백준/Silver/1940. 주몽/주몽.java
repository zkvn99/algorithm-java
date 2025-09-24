import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] armor = new int[N];
        
        for (int i = 0; i < N; i++) {
            armor[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(armor);
        
        int left = 0;
        int right = N - 1;
        int result = 0;
        
        while (left < right) {
            int count = armor[left] + armor[right];
            
            if (count == M) {
                result++;
                left++;
                right--;
            } else if (count < M) {
                left++;
            } else {
                right--;
            }
        }
        
        System.out.print(result);
    }
}