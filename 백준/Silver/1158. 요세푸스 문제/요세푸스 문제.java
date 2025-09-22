import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
        
        sb.append("<");
        while (!q.isEmpty()) {
            
            for (int i = 1; i < K; i++) {
                q.offer(q.poll());
            }
            
            sb.append(q.poll());
            if (!q.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");
        
        System.out.print(sb);
    }
}