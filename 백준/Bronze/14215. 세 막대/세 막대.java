import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[] {
            Integer.parseInt(st.nextToken()), 
            Integer.parseInt(st.nextToken()), 
            Integer.parseInt(st.nextToken())
        };
        
        Arrays.sort(arr);
        
        if (arr[0] + arr[1] > arr[2]) {
            System.out.print(arr[0] + arr[1] + arr[2]);
        } else {
            int maxPerimeter = (arr[0] + arr[1]) * 2 - 1;
            System.out.println(maxPerimeter);
        }
    }
}