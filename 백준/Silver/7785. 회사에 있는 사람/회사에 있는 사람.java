import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> employees = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();
            
            if (action.equals("enter")) {
                employees.add(name);
            } else {
                employees.remove(name);
            }
        }

        List<String> list = new ArrayList<>(employees);
        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String name : list) {
            sb.append(name).append('\n');
        }

        System.out.print(sb);
    }
}
