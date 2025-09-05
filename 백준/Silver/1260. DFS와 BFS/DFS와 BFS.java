import java.util.*;
import java.io.*;

public class Main {
    static List<List<Integer>> graph = new ArrayList<>();
    static List<Integer> bfsList = new ArrayList<>();
    static List<Integer> dfsList = new ArrayList<>();
    static boolean[] isVisit;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer firstLine = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(firstLine.nextToken());
        int M = Integer.parseInt(firstLine.nextToken());
        int V = Integer.parseInt(firstLine.nextToken());
        
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            graph.get(first).add(second);
            graph.get(second).add(first);
        }
        
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }
        
        isVisit = new boolean[N + 1];
        
        dfs(V);
        Arrays.fill(isVisit, false);
        bfs(V);
        
        StringBuilder dfsSb = new StringBuilder();
        for (int n : dfsList) {
            dfsSb.append(n).append(" ");
        }
        
        StringBuilder bfsSb = new StringBuilder();
        for (int n : bfsList) {
            bfsSb.append(n).append(" ");
        }
        
        System.out.println(dfsSb.toString().trim());
        System.out.println(bfsSb.toString().trim());
    }
    
    static void dfs(int node) {
        isVisit[node] = true;
        dfsList.add(node);
        
        for (int n : graph.get(node)) {
            if (!isVisit[n]) {
                dfs(n);
            }
        }
    }
    
    static void bfs(int node) {
        isVisit[node] = true;
        bfsList.add(node);
        
        Queue<Integer> q = new ArrayDeque<>();
        q.add(node);
        while (!q.isEmpty()) {
            int n = q.poll();
            for (int next : graph.get(n)) {
                if (!isVisit[next]) {
                    isVisit[next] = true;
                    bfsList.add(next);
                    q.add(next);
                }
            }
        }
        
    }
}