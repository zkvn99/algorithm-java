import java.util.*;
import java.io.*;

public class Main {
    
    static int reNum;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            
            reNum = 0;
            int isPal = isPalindrome(line);
            int calls = reNum;
            
            sb.append(isPal).append(" ").append(calls);
            if (i + 1 < T) sb.append('\n');
        }
        
        System.out.print(sb);
    }
    
    static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
    
    static int recursion(String s, int l, int r) {
        reNum++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }
}