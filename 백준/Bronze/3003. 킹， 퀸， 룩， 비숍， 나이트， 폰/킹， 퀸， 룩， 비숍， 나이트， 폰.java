import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = {1, 1, 2, 2, 2, 8};
        for (int i = 0 ; i < 6; i++) {
            int piece = scan.nextInt();
            System.out.print((list[i] - piece) + (i < 5 ? " " : ""));
        }
    }
}
