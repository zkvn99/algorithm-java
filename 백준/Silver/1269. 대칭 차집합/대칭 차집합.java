import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstLine = Integer.parseInt(st.nextToken());
        int secondLine = Integer.parseInt(st.nextToken());
        
        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < firstLine; i++) {
            int num = Integer.parseInt(st.nextToken());
            aSet.add(num);
        }
        
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < secondLine; j++) {
            int num = Integer.parseInt(st.nextToken());
            bSet.add(num);
        }
        
        Set<Integer> temp = new HashSet<>(aSet);
        temp.removeAll(bSet);
        bSet.removeAll(aSet);

        int result = temp.size() + bSet.size();
        
        System.out.print(result);
    }
}
