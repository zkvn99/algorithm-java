import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] time = new int[cnt];
        int temp = 0;
        int result = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i=0; i<cnt; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(time);

        for (int i=0; i<cnt; i++) {
            time[i] += temp;
            result += time[i];
            temp = time[i];
        }
        
        System.out.print(result);
    }
}