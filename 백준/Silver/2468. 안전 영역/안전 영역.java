import java.util.*;
import java.io.*;

public class Main {
    static int[][] height;
    static boolean[][] safety;
    static boolean[][] visit;
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    static int N;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        int max = 0;
        height = new int[N][N];
        for (int i = N - 1; i >= 0; i--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                height[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, height[i][j]);
            }
        }
        
        int result = 0;
        for (int i = 0; i < max; i++) {
            safety = new boolean[N][N];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (height[j][k] > i) safety[j][k] = true;
                }
            }
            
            visit = new boolean[N][N];
            int count = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (safety[j][k] && !visit[j][k]) {
                        bfs(j, k);
                        count++;
                    }
                }
            }
            
            result = Math.max(count, result);
        }
        
        System.out.print(result);
    }
    
    static void bfs(int x, int y) {
        visit[x][y] = true;
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{x, y});
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            
            for (int i = 0; i < 4; i++) {
                int px = cur[0] + dx[i];
                int py = cur[1] + dy[i];
                
                if (px < 0 || px >= N || py < 0 || py >= N) continue;
                
                if (safety[px][py] && !visit[px][py]) {
                    q.offer(new int[]{px, py});
                    visit[px][py] = true;
                }
            }
        }
    }
}