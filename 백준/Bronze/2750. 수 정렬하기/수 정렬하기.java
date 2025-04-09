import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] num = new int[N];
        
        for (int i=0; i<N; i++) {
            num[i] = scan.nextInt();
        }
        
        for (int j=0; j<N; j++) {
            for (int k=j+1; k<N; k++) {
                int temp = num[j];
                if (temp > num[k]) {
                    num[j] = num[k];
                    num[k] = temp;
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            System.out.println(num[i]);
        }
        
    }
}