import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] basket = new int[N];
        
        for (int i=0; i<N; i++) {
            basket[i] = i+1;
        }
        
        for (int j=0; j<M; j++) {
            int left = scan.nextInt();
            int right = scan.nextInt();
            int count = (right - left + 1) / 2;
             
            for (int k=0; k<count; k++) {
                int temp = basket[left-1];
                basket[left-1] = basket[right-1];
                basket[right-1] = temp;
                left++;
                right--;
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            result.append(basket[i]);
            if (i != N - 1) result.append(" ");
        }
        
        System.out.println(result);
    }
}