import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        K = Math.min(K, N - K);
        long result = 1;

        for (int i = 1; i <= K; i++) {
            result = result * (N - i + 1) / i;
        }

        System.out.println(result);
    }
}
