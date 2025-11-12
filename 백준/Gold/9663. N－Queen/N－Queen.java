import java.util.*;
import java.io.*;

public class Main {
    
    static int N;
    static int[] arr;
    static int count = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        
        dfs(0);
        
        System.out.print(count);
    }
    
    static void dfs(int depth) {
        
        if (depth == N) {
            count++;
            return;
        }
        
        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            
            if (isAvailable(depth)) {
                dfs(depth + 1);
            }
        }
    }
    
    static boolean isAvailable(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[i] == arr[col]) return false;
            if (Math.abs(i - col) == Math.abs(arr[i] - arr[col])) return false;
        }
        
        return true;
    }
}