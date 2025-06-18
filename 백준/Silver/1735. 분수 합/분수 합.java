import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());
        int c = Integer.parseInt(st2.nextToken());
        int d = Integer.parseInt(st2.nextToken()); 

        int lcm = b * d / gcd(b, d);
        int sumNumerator = a * (lcm / b) + c * (lcm / d);

        int common = gcd(sumNumerator, lcm);

        System.out.println((sumNumerator / common) + " " + (lcm / common));
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
