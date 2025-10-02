import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(
         (o1, o2) -> {
             int absCompare = Integer.compare(Math.abs(o1), Math.abs(o2));
             if (absCompare == 0) return Integer.compare(o1, o2);
             return absCompare;
         });
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (pq.isEmpty()) System.out.println(0);
                else System.out.println(pq.poll());
            } else {
                pq.add(num);
            }
        }
    }
}