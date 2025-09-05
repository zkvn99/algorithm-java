import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] score = new double[N];
        double max = 0;
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            max = Math.max(score[i], max);
        }
        
        double sum = 0;
        for (int j = 0; j < N; j++) {
            sum += score[j] / max * 100;
        }
        
        System.out.print(sum / N);
    }
}