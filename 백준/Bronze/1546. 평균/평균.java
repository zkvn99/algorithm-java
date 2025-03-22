import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cnt = scan.nextInt();
        int max = 0;
        double sum = 0;
        int[] score = new int[cnt];
        
        for (int i=0; i<cnt; i++) {
            score[i] = scan.nextInt();
            if (score[i] > max) max = score[i];
        }
        
        for (int i=0; i<cnt; i++) {
            sum += (double) score[i] / max * 100;
        }
        
        System.out.println(sum / cnt);
    }
}