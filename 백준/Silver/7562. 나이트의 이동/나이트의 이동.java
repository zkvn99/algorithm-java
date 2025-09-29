import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};
    static int l;
    static boolean[][] visit;
    static int[][] dist;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            l = Integer.parseInt(br.readLine());
            visit = new boolean[l][l];
            dist  = new int[l][l];

            st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());

            sb.append(bfs(sx, sy, ex, ey)).append('\n');
        }
        System.out.print(sb);
    }

    static int bfs(int sx, int sy, int ex, int ey) {
        if (sx == ex && sy == ey) return 0;

        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{sx, sy});
        visit[sy][sx] = true;
        dist[sy][sx] = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= l || ny >= l) continue;
                if (visit[ny][nx]) continue;

                visit[ny][nx] = true;
                dist[ny][nx] = dist[y][x] + 1;
                if (nx == ex && ny == ey) return dist[ny][nx];
                q.offer(new int[]{nx, ny});
            }
        }
        return -1;
    }
}
