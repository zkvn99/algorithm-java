import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> seen = new HashSet<>();
        int result = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.equals("ENTER")) {
                seen.clear();
            } else if (seen.add(s)) {
                result++;
            }
        }

        System.out.println(result);
    }
}
