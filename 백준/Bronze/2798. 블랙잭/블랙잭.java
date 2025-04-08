import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int max = 0;
        int[] num = new int[N];
        
        for (int i=0; i<N; i++) {
            num[i] = scan.nextInt();
        }
        
        for (int j=0; j<N; j++) {
            for (int k=j+1; k<N; k++) {
                for (int l=k+1; l<N; l++) {
                    int sum = num[j] + num[k] + num[l];
                    if (sum <= M && sum > max) {
                        max = sum;
                    }
                }
            }
        }
        
        System.out.print(max);
    }
}