import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        set.add("ChongChong");
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String nameA = st.nextToken();
            String nameB = st.nextToken();
            if (set.contains(nameA) || set.contains(nameB)) {
                set.add(nameA);
                set.add(nameB);
            }
        }
        
        System.out.print(set.size());
    }
}