import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        String number = scan.next();  
        int result = 0;

        for (int i = 0; i < count; i++) {
            result += number.charAt(i) - '0'; 
        }

        System.out.println(result);
    }
}
