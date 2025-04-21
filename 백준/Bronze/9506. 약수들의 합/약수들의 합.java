import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int num = Integer.parseInt(br.readLine());
            
            if (num == -1) {
                break;
            }
            
            List<Integer> divisors = new ArrayList<>();
            int sum = 0;
            
            for (int i=1; i<num; i++) {
                if (num % i == 0) {
                    divisors.add(i);
                    sum += i;
                }    
            }
            
            if (sum == num) {
                System.out.print(num + " = ");
                for (int i = 0; i < divisors.size(); i++) {
                    System.out.print(divisors.get(i));
                    if (i < divisors.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(num + " is NOT perfect.");
            }
            
        }
    }
}