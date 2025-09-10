import java.util.*;
import java.io.*;

public class Main {
    static boolean[][] visited;
    static int[][] house;
    static int N;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine().trim());

        visited = new boolean[N][N];
        house = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine().trim();
            for (int j = 0; j < N; j++) {
                house[i][j] = line.charAt(j) - '0';
            }
        }

        List<Integer> sizes = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (house[i][j] == 1 && !visited[i][j]) {
                    sizes.add(bfs(i, j));
                }
            }
        }

        Collections.sort(sizes);
        StringBuilder sb = new StringBuilder();
        sb.append(sizes.size()).append('\n');  
        for (int s : sizes) sb.append(s).append('\n'); 
        System.out.print(sb);
    }

    static int bfs(int sx, int sy) {
        Deque<int[]> q = new ArrayDeque<>();
        visited[sx][sy] = true;
        q.add(new int[]{sx, sy});
        int count = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;

                if (!visited[nx][ny] && house[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                    count++;
                }
            }
        }
        return count;
    }
}
