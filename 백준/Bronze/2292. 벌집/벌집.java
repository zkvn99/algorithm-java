import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int layer = 1;
        int range = 1;

        while (N > range) {
            range += 6 * layer;
            layer++;
        }

        System.out.println(layer);
    }
}
