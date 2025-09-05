import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer firstLine = new StringTokenizer(br.readLine());
        StringTokenizer secondLine = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(firstLine.nextToken());
        int X = Integer.parseInt(firstLine.nextToken());
        int number = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            number = Integer.parseInt(secondLine.nextToken());
            
            if (number < X) {
                sb.append(number).append(" ");
            }
        }
        
        System.out.println(sb.toString().trim());
    }
}