import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long result = (long) n * (n - 1) / 2;
        System.out.println(result);
        System.out.println(2); 
    }
}
