import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        scan.nextLine();
        
        for (int i = 0; i < count; i++) {
            String line = scan.nextLine();
            int repeat = Character.getNumericValue(line.charAt(0));
            StringBuilder result = new StringBuilder();
            
            for (int j = 2; j < line.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    result.append(line.charAt(j));
                }
            }
            System.out.println(result);
        }
    }
}
