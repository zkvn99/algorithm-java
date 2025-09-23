import java.util.*;
import java.io.*;

public class Main {
    static class Truck {
        public int weight;
        public int exitTime;
        
        public Truck(int weight, int exitTime) {
            this.weight = weight;
            this.exitTime = exitTime;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int w = Integer.parseInt(st1.nextToken());
        int L = Integer.parseInt(st1.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] truckWeight = new int[n];
        for (int i = 0; i < n; i++) {
            truckWeight[i] = Integer.parseInt(st2.nextToken());
        }
        
        Queue<Truck> bridge = new LinkedList<>();
        int sumWeight = 0;
        int time = 0;
        int idx = 0;
        
        while (true) {
            time++;
            
            if (!bridge.isEmpty() && bridge.peek().exitTime == time) {
                sumWeight -= bridge.poll().weight;
            }
            
            if (idx < truckWeight.length) {
                if (L >= truckWeight[idx] + sumWeight && bridge.size() < w) {
                    bridge.offer(new Truck(truckWeight[idx], time + w));
                    sumWeight += truckWeight[idx];
                    idx++;
                }
            }
            
            if (idx == truckWeight.length && bridge.isEmpty()) {
                break;
            }
        }
        
        System.out.print(time);
    }
}