import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        
        String numLine = scan.nextLine();
        String[] numList = numLine.split(" ");
        
        int min = 0;
        int max = 0;
        
        for (String num : numList) {      
            int temp = Integer.parseInt(num);
            
            if (min == 0) {
                min = temp;
                max = temp;
            }
            
            if (min > temp) {
                min = temp;
            }
            
            if (max < temp) {
                max = temp;
            }
        }
        
        System.out.println(min + " " + max);
    }
}