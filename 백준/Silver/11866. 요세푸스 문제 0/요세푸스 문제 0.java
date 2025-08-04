import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        Queue<Integer> queue = new ArrayDeque<>();
        
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        
        List<Integer> result = new ArrayList<>();
        while (queue.size() > 0) {
            for (int i = 1; i < K; i++) {
                queue.offer(queue.poll());
            }
            result.add(queue.poll());
        }
        
        System.out.print("<");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}