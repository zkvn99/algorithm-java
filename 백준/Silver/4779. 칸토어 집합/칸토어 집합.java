import java.io.*;
import java.util.*;

public class Main {

    static char[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);

            int len = (int) Math.pow(3, n);
            arr = new char[len];
            Arrays.fill(arr, '-');

            cantor(0, len);

            System.out.println(new String(arr));
        }
    }

    static void cantor(int start, int size) {
        if (size < 3) return;

        int div = size / 3;

        for (int i = start + div; i < start + div * 2; i++) {
            arr[i] = ' ';
        }

        cantor(start, div);
        cantor(start + div * 2, div);
    }
}
