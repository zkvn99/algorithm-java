import java.util.*;
import java.io.*;

public class Main {
    static boolean[][] coordinate;
    static boolean[][] visit;
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    static int M;
    static int N;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        M = Integer.parseInt(st.nextToken()); // 세로 길이
        N = Integer.parseInt(st.nextToken()); // 가로 길이
        int K = Integer.parseInt(st.nextToken()); // 좌표 개수
        
        coordinate = new boolean[M][N];
        visit = new boolean[M][N];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    coordinate[y][x] = true;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!coordinate[i][j] && !visit[i][j]) {
                    list.add(bfs(i, j));
                    count++;
                }
            }
        }
        Collections.sort(list);
        sb.append(count).append("\n");
        for (int n : list) {
            sb.append(n).append(" ");
        }
        
        System.out.print(sb.toString().trim());
    }
    
    static int bfs(int x, int y) {
        visit[x][y] = true;
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{x, y});
        int width = 1;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int px = cur[0] + dx[i];
                int py = cur[1] + dy[i];
                
                if (px < 0 || px >= M || py < 0 || py >= N) continue;
                
                if (!coordinate[px][py] && !visit[px][py]) {
                    q.offer(new int[]{px, py});
                    visit[px][py] = true;
                    width++;
                }
            }
        }
        
        return width;
    }
}