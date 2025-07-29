import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            if (line.startsWith("1")) {
                int num = Integer.parseInt(line.split(" ")[1]);
                stack.push(num);
            } else {
                int command = Integer.parseInt(line);
                switch (command) {
                    case 2:
                        sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                        break;
                    case 3:
                        sb.append(stack.size()).append("\n");
                        break;
                    case 4:
                        sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                        break;
                    case 5:
                        sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                        break;
                }
            }
        }

        System.out.print(sb);
    }
}
