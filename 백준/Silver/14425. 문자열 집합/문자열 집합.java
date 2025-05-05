import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<String> li = new ArrayList<>();
        int result = 0;
        
        for (int i=0; i<N; i++) {
            li.add(br.readLine());
        }
        
        for (int j=0; j<M; j++) {
            if(li.contains(br.readLine())) {
                result++;
            }
        }
        
        System.out.print(result);
    }
}