import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for (int i=line.length()-1; i>=0; i--) {
            sb.append(line.charAt(i));
        }
        
        if (line.equals(sb.toString())) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}