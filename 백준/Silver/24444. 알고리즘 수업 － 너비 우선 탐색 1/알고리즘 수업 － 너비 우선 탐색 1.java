import java.util.*;
import java.io.*;

public class Main {
    static List<Integer>[] graph;
    static boolean[] isVisited; 
    static int[] order;
    static int seq = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer firstLine = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(firstLine.nextToken());
        int M = Integer.parseInt(firstLine.nextToken());
        int R = Integer.parseInt(firstLine.nextToken());
        
        graph = new ArrayList[N + 1];
        isVisited = new boolean[N + 1];
        order = new int[N + 1];
        
        for (int i = 0; i <= N; i++) graph[i] = new ArrayList<>();
        
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }
        
        for (int i = 1; i <= N; i++) Collections.sort(graph[i]);
        
        bfs(R);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(order[i]).append('\n');
        }
        
        System.out.print(sb);
    }
    
    static void bfs(int num) {
        isVisited[num] = true;
        order[num] = ++seq;
        
        Queue<Integer> q = new ArrayDeque<>();
        q.add(num);
        
        while (!q.isEmpty()) {
            int n = q.poll();
            for (int next : graph[n]) {
                if (!isVisited[next]) {
                    isVisited[next] = true;
                    order[next] = ++seq;
                    q.add(next);
                }
            }
        }
    }
}