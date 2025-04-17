import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] numStr = line.split(" ");
        int N = Integer.parseInt(numStr[0]);
        int B = Integer.parseInt(numStr[1]);
        StringBuilder sb = new StringBuilder();
        
        while(N > 0) {
            int r = N % B;
            
            if (r < 10) 
                sb.append((char) (r + '0'));
            else
                sb.append((char) (r - 10 + 'A'));
            
            N /= B;
        }
        
        System.out.println(sb.reverse());
    }
}