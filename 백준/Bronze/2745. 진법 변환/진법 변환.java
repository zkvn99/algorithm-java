import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] parts = line.split(" ");
        int system = Integer.parseInt(parts[1]);
        int result = 0;
        int n = 0;
        
        for (int i=parts[0].length()-1; i>=0; i--) {
            char c = parts[0].charAt(i);
            int value;
            
            if (Character.isDigit(c)) {
                value = c - '0';
            } else {
                value = c - 'A' + 10;
            }
            
            result += value * (int)Math.pow(system, n);
            n++;
        }
        
        System.out.println(result); 
    }
}