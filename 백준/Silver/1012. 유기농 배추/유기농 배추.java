import java.util.*;
import java.io.*;

public class Main {
    static int[][] cabbage;
    static boolean[][] visited;
    static final int[] dx = {0, 0, -1, 1};
    static final int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            cabbage = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < K; i++) {
                StringTokenizer c = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(c.nextToken());
                int y = Integer.parseInt(c.nextToken());
                cabbage[y][x] = 1; // 입력이 (x, y)
            }

            int count = 0;
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (!visited[y][x] && cabbage[y][x] == 1) {
                        bfs(y, x);
                        count++;
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb.toString());
    }

    static void bfs(int sy, int sx) {
        int N = cabbage.length;
        int M = cabbage[0].length;

        Deque<int[]> q = new ArrayDeque<>();
        visited[sy][sx] = true;
        q.add(new int[]{sy, sx});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int y = cur[0], x = cur[1];

            for (int dir = 0; dir < 4; dir++) {
                int ny = y + dy[dir];
                int nx = x + dx[dir];

                if (0 <= nx && nx < M && 0 <= ny && ny < N) {
                    if (!visited[ny][nx] && cabbage[ny][nx] == 1) {
                        visited[ny][nx] = true;
                        q.add(new int[]{ny, nx});
                    }
                }
            }
        }
    }
}
