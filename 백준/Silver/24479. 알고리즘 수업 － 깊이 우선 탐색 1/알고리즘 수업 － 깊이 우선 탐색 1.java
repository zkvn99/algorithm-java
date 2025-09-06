import java.util.*;
import java.io.*;

public class Main {
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] order;
    static int seq = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer fst = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(fst.nextToken());
        int M = Integer.parseInt(fst.nextToken());
        int R = Integer.parseInt(fst.nextToken());

        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for (int i = 1; i <= N; i++) Collections.sort(graph.get(i));

        order = new int[N + 1];
        dfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) sb.append(order[i]).append('\n');
        System.out.print(sb);
    }

    static void dfs(int u) {
        order[u] = ++seq;               
        for (int v : graph.get(u)) {
            if (order[v] == 0) dfs(v);  
        }
    }
}
