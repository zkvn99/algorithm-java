import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] type = new int[n];
        int[] data = new int[n];
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            type[i] = Integer.parseInt(st1.nextToken());
        }
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st2.nextToken());
        }

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            if (type[i] == 0) {
                queue.addLast(data[i]);
            }
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st3.nextToken());
            queue.addLast(x);
            x = queue.pollFirst();
            sb.append(x).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
