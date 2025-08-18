import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int N = Integer.parseInt(s);
            int len = 1;
            for (int i = 0; i < N; i++) len *= 3;

            char[] arr = new char[len];
            Arrays.fill(arr, '-');

            carve(arr, 0, len);

            System.out.println(new String(arr));
        }
    }
    
    static void carve(char[] arr, int l, int r) {
        int size = r - l;
        if (size == 1) return;
        int third = size / 3;
        for (int i = l + third; i < l + 2 * third; i++) arr[i] = ' ';
        carve(arr, l, l + third);
        carve(arr, l + 2 * third, r);
    }
}