import java.util.*;
import java.io.*;

public class Main {
    static int N, M, start, end;
    static int[] dis;
    
    static class Bus implements Comparable<Bus> {
        public int end;
        public int money;
        
        public Bus(int end, int money) {
            this.end = end;
            this.money = money;
        }
        
        @Override
        public int compareTo(Bus b) {
            return Integer.compare(this.money, b.money);
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        
        List<List<Bus>> graph = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());
        
        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Bus(b, c));
        }
        
        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        
        dis = new int[N + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        
        dijkstra(graph, start);
        
        System.out.print(dis[end]);
    }
    
    static void dijkstra(List<List<Bus>> graph, int start) {
        PriorityQueue<Bus> pq = new PriorityQueue<>();
        pq.offer(new Bus(start, 0));
        dis[start] = 0;
        
        while (!pq.isEmpty()) {
            Bus cur = pq.poll();
            int fin = cur.end;
            int money = cur.money;
            
            if(money > dis[fin]) continue;
            
            for(Bus bus : graph.get(fin)) {
                int sum = money + bus.money;
                if(dis[bus.end] > sum) {
                    dis[bus.end] = sum;
                    pq.offer(new Bus(bus.end, sum));
                }
            }
        }
    }
}