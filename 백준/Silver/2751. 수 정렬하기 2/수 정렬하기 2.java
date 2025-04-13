import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numCount = Integer.parseInt(st.nextToken());
        int[] numArr = new int[numCount];
        
        for (int i=0; i<numCount; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(numArr);
        
        for (int i=0; i<numCount; i++) {
            bw.write(numArr[i] + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}