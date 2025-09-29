import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[][] t = new int[n + 1][n + 1];
        int[][] dp = new int[n + 1][n + 1];
        
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= i; j++) {
                t[i][j] = Integer.parseInt(st.nextToken());
            }
        }
                     
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + t[i][j];
            }
        }
        
        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(dp[n][i], max);
        }
        System.out.println(max);
    }
}