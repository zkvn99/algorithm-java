import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int count = scan.nextInt();
            scan.nextLine();

            for (int i = 0; i < count; i++) {
                String alphabet = scan.nextLine();
                char first = alphabet.charAt(0);
                char last = alphabet.charAt(alphabet.length() - 1);
                System.out.println("" + first + last); 
            }
        }
    }
}
