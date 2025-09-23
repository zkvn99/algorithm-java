import java.util.*;
import java.io.*;

public class Main {
    
    static class Jewel {
        public int weight;
        public int price;
        
        public Jewel(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        Jewel[] jewels = new Jewel[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            jewels[i] = new Jewel(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        
        int[] bags = new int[K];
        for (int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(jewels, Comparator.comparingInt(j -> j.weight));
        Arrays.sort(bags);
        
        int j = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        long price = 0;
        for (int bag : bags) {
            while (j < N && jewels[j].weight <= bag) {
                maxHeap.offer(jewels[j].price);
                j++;
            }

            if (!maxHeap.isEmpty()) price += maxHeap.poll();
        }

        System.out.print(price);
    }
}