import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] basket = new int[3]; 
        int[] numList = new int[N];

        scan.nextLine();

        for (int i = 0; i < M; i++) {
            String line = scan.nextLine();
            String[] num = line.split(" ");
            
            for (int j = 0; j < 3; j++) {
                basket[j] = Integer.parseInt(num[j]);
            }

            for (int k = basket[0] - 1; k <= basket[1] - 1; k++) {
                numList[k] = basket[2];
            }
        }

        StringBuilder result = new StringBuilder();
        for (int l = 0; l < N; l++) {
            result.append(numList[l]);
            if (l != N - 1) result.append(" ");
        }

        System.out.println(result.toString());
    }
}
