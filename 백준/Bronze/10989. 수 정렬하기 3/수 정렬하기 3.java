import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] list = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            sb.append(list[i]).append('\n');
        }

        System.out.print(sb);
    }
}
