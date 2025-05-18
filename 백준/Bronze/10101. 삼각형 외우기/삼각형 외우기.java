import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());

        int sum = x + y + z;

        if (sum != 180) {
            System.out.print("Error");
        } else if (x == y && y == z) {
            System.out.print("Equilateral");
        } else if (x == y || y == z || x == z) {
            System.out.print("Isosceles");
        } else {
            System.out.print("Scalene");
        }
    }
}
