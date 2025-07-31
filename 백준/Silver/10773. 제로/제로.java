import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (num != 0) {
                stack.push(num);
            } else {
                stack.pop();
            }
        }
        
        for (int n : stack) {
            result += n;
        }
        
        System.out.print(result);
    }
}