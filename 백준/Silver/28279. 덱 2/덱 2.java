import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lineCount; i++) {
            String line = br.readLine();
            char cmd = line.charAt(0);

            switch (cmd) {
                case '1':
                    deque.addFirst(Integer.parseInt(line.substring(2)));
                    break;
                case '2':
                    deque.addLast(Integer.parseInt(line.substring(2)));
                    break;
                case '3':
                    sb.append(deque.isEmpty() ? -1 : deque.removeFirst()).append("\n");
                    break;
                case '4':
                    sb.append(deque.isEmpty() ? -1 : deque.removeLast()).append("\n");
                    break;
                case '5':
                    sb.append(deque.size()).append("\n");
                    break;
                case '6':
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case '7':
                    sb.append(deque.isEmpty() ? -1 : deque.getFirst()).append("\n");
                    break;
                case '8':
                    sb.append(deque.isEmpty() ? -1 : deque.getLast()).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}
