import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int num = 0;
        int rank = 0;
        
        for (int i=0; i<9; i++) {
            num = scan.nextInt();
            if (num > first) {
                first = num;
                rank = i+1;
            }
        }
        
        System.out.println(first);
        System.out.println(rank);
    }
}