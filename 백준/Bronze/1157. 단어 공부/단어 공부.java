import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().toUpperCase();
        
        int[] count = new int[26];
        for (char c : line.toCharArray()) {
            count[c - 'A']++;
        }
        
        int max = 0;
        char result = '?';
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if (count[i] == max) {
                result = '?';
            }
        }
        
        System.out.print(result);
    }
}