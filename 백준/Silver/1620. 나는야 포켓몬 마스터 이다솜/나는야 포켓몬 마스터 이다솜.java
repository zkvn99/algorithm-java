import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] pokemon = new String[N + 1];
        Map<String, Integer> map = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            pokemon[i] = name;
            map.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < M; j++) {
            String query = br.readLine();

            if (isNumeric(query)) {
                int num = Integer.parseInt(query);
                sb.append(pokemon[num]).append("\n");
            } else {
                sb.append(map.get(query)).append("\n");
            }
        }

        System.out.print(sb);
    }

    private static boolean isNumeric(String str) {
        return str.chars().allMatch(Character::isDigit);
    }
}
