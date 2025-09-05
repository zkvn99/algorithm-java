import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] isVisit;
    static int cnt = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int comCnt = Integer.parseInt(br.readLine());
        int pairCnt = Integer.parseInt(br.readLine());
       
        for (int i = 0; i <= comCnt; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < pairCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        isVisit = new boolean[comCnt + 1];
        dfs(1);
        
        System.out.println(cnt - 1);
    }
    
    static void dfs(int node) {
        isVisit[node] = true;
        cnt++;
        
        for (int next : graph.get(node)) {
            if (!isVisit[next]) {
                dfs(next);
            }
        }
    }
}