import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt(); 
        int h = scan.nextInt();
        
        int min = Math.min(Math.min(x, w - x), Math.min(y, h - y));
        System.out.println(min);
    }
}
