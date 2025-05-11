import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int line = 1;
        
        while (X > line) {
            X -= line;
            line++;
        }
        
        int numerator, denominator;
        if (line % 2 == 0) {
            numerator = X;
            denominator = line - X + 1;
        } else {
            numerator = line - X + 1;
            denominator = X;
        }

        System.out.print(numerator + "/" + denominator);        
    }
}