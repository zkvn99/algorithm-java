import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        char[] pipe = line.toCharArray();
        Stack<Character> s = new Stack<>();
        int result = 0;
        boolean isPush = false;
        
        for (char c : pipe) {
            if (c == '(') {
                s.push('(');
                isPush = true;
            }
            else {
                s.pop();
                if (isPush) {
                    result += s.size();
                } else {
                    result += 1;
                }
                isPush = false;
            }
        }
        
        System.out.print(result);
    }
}