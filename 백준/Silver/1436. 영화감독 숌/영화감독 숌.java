import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int num = 0;
        int result = 0;
        
        while (count > 0) {
            num++;
            if (Integer.toString(num).contains("666")) {
                count--;
                result = num;
            }
        }
        
        System.out.print(result);
    }
}