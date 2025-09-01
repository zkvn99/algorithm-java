import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int firstLine = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        
        String line = br.readLine();
        int[] numArr = Arrays.stream(line.split(" "))
                             .mapToInt(Integer::parseInt)
                             .toArray();
        
        int[] prefixSum = new int[firstLine + 1];
        for (int i = 1; i <= firstLine; i++) {
            prefixSum[i] = prefixSum[i - 1] + numArr[i - 1];
        }
        
        for (int i = 0; i < count; i++) {
            StringTokenizer stLine = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(stLine.nextToken());
            int end = Integer.parseInt(stLine.nextToken());
            int result = 0;
            
            System.out.println(prefixSum[end] - prefixSum[start - 1]);
        }
    }
}