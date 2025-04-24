import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[4];
        int[] y = new int[4];
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        
        x[3] = x[0] ^ x[1] ^ x[2];
        y[3] = y[0] ^ y[1] ^ y[2];
        
        sb.append(x[3]).append(" ");
        sb.append(y[3]);
        
        System.out.print(sb);
    }
}