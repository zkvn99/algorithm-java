import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] num = new int[9][9];
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int n = 0;
        int m = 0;
        
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                num[i][j] = scan.nextInt();            
                if (num[i][j] > max) {
                    max = num[i][j];
                    n = i;
                    m = j;
                }
            }
        }
        
        System.out.println(max);
        System.out.println((n+1)+ " " + (m+1));
    }
}