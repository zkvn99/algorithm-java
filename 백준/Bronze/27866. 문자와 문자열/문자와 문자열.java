import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int num = scan.nextInt();
        
        System.out.println(line.charAt(num-1));
    }
}