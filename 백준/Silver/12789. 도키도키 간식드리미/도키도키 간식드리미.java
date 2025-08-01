import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] seq = new int[N];

        for (int i = 0; i < line.length; i++) {
            seq[i] = Integer.parseInt(line[i]);
        }

        Stack<Integer> stack = new Stack<>();
        int now = 1;

        for (int num : seq) {
            if (num == now) {
                now++;
            } else {
                while (!stack.isEmpty() && stack.peek() == now) {
                    stack.pop();
                    now++;
                }
                stack.push(num);
            }
        }

        while (!stack.isEmpty() && stack.peek() == now) {
            stack.pop();
            now++;
        }

        System.out.print(stack.isEmpty() ? "Nice" : "Sad");
    }
}
