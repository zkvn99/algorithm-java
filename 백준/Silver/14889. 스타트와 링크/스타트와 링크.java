import java.util.*;
import java.io.*;

public class Main {
    
    static int[][] status;
    static int N;
    static int min = Integer.MAX_VALUE;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        status = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; j++) {
                status[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        setTeam(1, 0);
        System.out.print(min);
    }
    
    static void setTeam(int depth, int count) {
        if (count == N / 2) {
            calc();
            return;
        }
        
        for (int i = depth; i < N + 1; i++) {
            if (!visited[i]) {
                visited[i] = true;
                setTeam(i + 1, count + 1);
                visited[i] = false;
            }
        }
    }
    
    static void calc() {
        int firstScore = 0;
        int secondScore = 0;
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (visited[i] && visited[j]) {
                    firstScore += status[i][j];
                }
                
                if (!visited[i] && !visited[j]) {
                    secondScore += status[i][j];
                }
            }
        }
        
        int abs = Math.abs(firstScore - secondScore);
        min = Math.min(min, abs);
    }
}