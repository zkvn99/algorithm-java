import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new ArrayDeque<>();
        int last = -1;

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            if (line.startsWith("push")) {
                int num = Integer.parseInt(line.split(" ")[1]);
                queue.offer(num);
                last = num;
            } else if (line.equals("pop")) {
                sb.append(queue.isEmpty() ? -1 : queue.poll()).append('\n');
            } else if (line.equals("size")) {
                sb.append(queue.size()).append('\n');
            } else if (line.equals("empty")) {
                sb.append(queue.isEmpty() ? 1 : 0).append('\n');
            } else if (line.equals("front")) {
                sb.append(queue.isEmpty() ? -1 : queue.peek()).append('\n');
            } else if (line.equals("back")) {
                sb.append(queue.isEmpty() ? -1 : last).append('\n');
            }
        }

        System.out.print(sb);
    }
}
