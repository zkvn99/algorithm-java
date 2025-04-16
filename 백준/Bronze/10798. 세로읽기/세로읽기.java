import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = new String[5];
        
        int maxLen = 0;
        for (int i = 0; i < 5; i++) {
            line[i] = br.readLine();
            maxLen = Math.max(maxLen, line[i].length());
        }

        for (int i = 0; i < maxLen; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < line[j].length()) {
                    System.out.print(line[j].charAt(i));
                }
            }
        }
    }
}
