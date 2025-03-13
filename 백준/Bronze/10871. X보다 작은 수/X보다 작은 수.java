import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int X = scan.nextInt();
        
        scan.nextLine(); 

        String secondLine = scan.nextLine();   
        String[] parts = secondLine.split(" ");
        
        String result = "";
        
        for (String n : parts) {
            if (Integer.parseInt(n) < X) {
                if (result.equals("")) {
                    result += n;
                } else {
                    result += " " + n;
                }
            }
        }
        
        System.out.println(result);
    }
}