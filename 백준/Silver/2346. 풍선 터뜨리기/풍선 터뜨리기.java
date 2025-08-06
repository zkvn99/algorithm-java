import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int balloonCount = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Deque<Balloon> deque = new ArrayDeque<>();
        for (int i = 0; i < balloonCount; i++) {
            int move = Integer.parseInt(st.nextToken());
            deque.addLast(new Balloon(i + 1, move));
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (!deque.isEmpty()) {
            Balloon current = deque.pollFirst();
            sb.append(current.index).append(" ");
            
            if (deque.isEmpty())
                break;
            
            int move = current.move;
            
            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < -move; i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }
        
        System.out.print(sb.toString().trim());
    }
    
    static class Balloon {
        int index;
        int move;
        
        public Balloon(int index, int move) {
            this.index = index;
            this.move = move;
        }
    }
}