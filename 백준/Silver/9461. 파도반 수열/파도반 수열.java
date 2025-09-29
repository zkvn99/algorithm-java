import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] ns = new int[T];
        int maxN = 0;
        for (int i = 0; i < T; i++) {
            ns[i] = Integer.parseInt(br.readLine());
            if (ns[i] > maxN) maxN = ns[i];
        }

        long[] p = new long[Math.max(4, maxN + 1)];
        p[1] = 1;
        p[2] = 1;
        p[3] = 1;
        for (int i = 4; i <= maxN; i++) {
            p[i] = p[i - 2] + p[i - 3];
        }

        StringBuilder sb = new StringBuilder();
        for (int n : ns) sb.append(p[n]).append('\n');
        System.out.print(sb);
    }
}
