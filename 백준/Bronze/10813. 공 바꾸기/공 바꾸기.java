import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        scan.nextLine();

        int[] number = new int[N];
        
        for (int i = 0; i < N; i++) {
            number[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {
            String list = scan.nextLine();
            String[] part = list.split(" ");

            int num1 = Integer.parseInt(part[0]);
            int num2 = Integer.parseInt(part[1]);

            int temp = number[num1 - 1];
            number[num1 - 1] = number[num2 - 1];
            number[num2 - 1] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i != 0) sb.append(" ");
            sb.append(number[i]);
        }

        System.out.println(sb);
    }
}
