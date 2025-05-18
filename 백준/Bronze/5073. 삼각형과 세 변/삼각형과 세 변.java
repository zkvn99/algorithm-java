import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if (x == 0 && y == 0 && z == 0) {
                break;
            }

            int[] arr = new int[]{x, y, z};
            Arrays.sort(arr); 

            if (arr[2] >= arr[0] + arr[1]) {
                System.out.println("Invalid");
            } else if (x == y && y == z) {
                System.out.println("Equilateral");
            } else if (x == y || y == z || x == z) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
