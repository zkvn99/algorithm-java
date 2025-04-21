import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        int[] coins = {25, 10, 5, 1};

        for (int i = 0; i < T; i++) {
            int remain = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            
            for (int coin : coins) {
                sb.append(remain / coin).append(" ");
                remain %= coin;
            }
            
            System.out.println(sb.toString().trim());
        }
    }
}
