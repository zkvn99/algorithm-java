import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean[] isSubmitted = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int num = scan.nextInt();
            isSubmitted[num] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!isSubmitted[i]) {
                System.out.println(i);
            }
        }
    }
}
