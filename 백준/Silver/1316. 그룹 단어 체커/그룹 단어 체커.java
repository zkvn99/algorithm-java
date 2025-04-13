import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());
        int result = 0;
        
        for (int i=0; i<count; i++) {
            String word = br.readLine();
            boolean[] ch = new boolean[26];
            boolean chkGroup = true;
            
            for (int j=0; j<word.length(); j++) {
                char c = word.charAt(j);
                int idx = c - 'a';
                
                if (ch[idx]) {
                    if (j != 0 && c != word.charAt(j-1)) {
                       chkGroup = false;
                       break;
                    }
                } else {
                    ch[idx] = true;
                }
            }
            
            if (chkGroup) {
                result++;
            }
        }
        
        System.out.println(result);
    }
}