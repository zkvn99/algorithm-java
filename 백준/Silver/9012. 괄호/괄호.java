import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String line = br.readLine();
            int count = 0;
            boolean isVPS = true;

            for (char c : line.toCharArray()) {
                if (c == '(') {
                    count++;
                } else {
                    count--;
                }

                if (count < 0) {
                    isVPS = false;
                    break;
                }
            }

            if (count != 0) isVPS = false;

            System.out.println(isVPS ? "YES" : "NO");
        }
    }
}
