import java.util.*;
import java.io.*;

public class Main {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] isVisit;
    static int cnt = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer graphSt = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(graphSt.nextToken());
        int M = Integer.parseInt(graphSt.nextToken());
        
        isVisit = new boolean[N + 1];
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
            if (!isVisit[i]) {
                dfs(i);
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
    
    static void dfs(int num) {
        isVisit[num] = true;
        
        for (int next : graph.get(num)) {
            if (!isVisit[next]) {
                dfs(next);
            }
        }
    }
}