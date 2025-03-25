import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            System.out.println("*".repeat(i * 2 - 1));
        }

        for (int i = n - 1; i >= 1; i--) {
            System.out.print(" ".repeat(n - i));
            System.out.println("*".repeat(i * 2 - 1));
        }
    }
}
