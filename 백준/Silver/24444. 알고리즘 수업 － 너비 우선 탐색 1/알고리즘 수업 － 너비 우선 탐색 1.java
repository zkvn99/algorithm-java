import java.io.*;
import java.util.*;

public class Main {
    static int N, M, R;
    static int[] head, adj, order, deg;
    static int seq;

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        N = fs.nextInt();
        M = fs.nextInt();
        R = fs.nextInt();

        deg = new int[N + 1];
        int[] U = new int[M];
        int[] V = new int[M];

        // 1) 간선 입력 1-pass로 degree만 세어둠
        for (int i = 0; i < M; i++) {
            int u = fs.nextInt();
            int v = fs.nextInt();
            U[i] = u; V[i] = v;
            deg[u]++; deg[v]++;
        }

        // 2) head(prefix sum) 구성 → 각 정점의 시작 인덱스
        head = new int[N + 2];
        for (int i = 1; i <= N; i++) head[i + 1] = head[i] + deg[i];

        // 3) adj 채우기 (두 방향)
        adj = new int[head[N + 1]];
        int[] cur = head.clone(); // 쓰는 포인터
        for (int i = 0; i < M; i++) {
            int u = U[i], v = V[i];
            adj[cur[u]++] = v;
            adj[cur[v]++] = u;
        }

        // 4) 각 정점 이웃 오름차순 정렬
        for (int i = 1; i <= N; i++) {
            Arrays.sort(adj, head[i], head[i + 1]);
        }

        // 5) BFS
        order = new int[N + 1];
        bfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) sb.append(order[i]).append('\n');
        System.out.print(sb);
    }

    static void bfs(int s) {
        int[] q = new int[N]; // 최대 N개
        int front = 0, back = 0;

        order[s] = ++seq;
        q[back++] = s;

        while (front < back) {
            int u = q[front++];
            for (int p = head[u]; p < head[u + 1]; p++) {
                int v = adj[p];
                if (order[v] == 0) {
                    order[v] = ++seq;
                    q[back++] = v;
                }
            }
        }
    }

    // fast input
    static final class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr, len;
        FastScanner(InputStream is) { in = is; }
        private int read() throws IOException {
            if (ptr >= len) { len = in.read(buffer); ptr = 0; if (len <= 0) return -1; }
            return buffer[ptr++];
        }
        int nextInt() throws IOException {
            int c, s = 1, x = 0;
            do c = read(); while (c <= 32);
            if (c == '-') { s = -1; c = read(); }
            while (c > 32) { x = x * 10 + (c - '0'); c = read(); }
            return x * s;
        }
    }
}
