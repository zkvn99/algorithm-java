import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> countMap = new HashMap<>();

        String line = br.readLine();
        line = line.toUpperCase();
        String[] tokens = line.split("");
        String result = "?";
        int maxCount = 0;

        for (String token : tokens) {
            countMap.put(token, countMap.getOrDefault(token, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                result = entry.getKey();
            } else if (count == maxCount) {
                result = "?";
            }
        }
        
        System.out.println(result);
    }
}
