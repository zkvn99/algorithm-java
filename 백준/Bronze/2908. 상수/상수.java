import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        
        int reverseA = 0;
        int reverseB = 0;
        
        for (int i=0; i<3; i++) {
            if (i == 0) {
                reverseA += (A % 10) * 100;
                A = A / 10;
                reverseB += (B % 10) * 100;
                B = B / 10;
            } else if (i == 1) {
                reverseA += (A % 10) * 10;
                A = A / 10;
                reverseB += (B % 10) * 10;
                B = B / 10;
            } else {
                reverseA += A % 10;
                reverseB += B % 10;
            }
        }
        
        System.out.println(Math.max(reverseA, reverseB));
    }
}