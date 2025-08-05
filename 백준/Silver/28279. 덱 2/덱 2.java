import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < lineCount; i++) {
            String line = br.readLine();
            
            if (line.startsWith("1")) {
                int num = Integer.parseInt(line.split(" ")[1]);
                deque.addFirst(num);
            } else if (line.startsWith("2")) {
                int num = Integer.parseInt(line.split(" ")[1]);
                deque.addLast(num);
            } else if (line.startsWith("3")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(deque.removeFirst());
                }
            } else if (line.startsWith("4")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(deque.removeLast());
                }
            } else if (line.startsWith("5")) {
                System.out.println(deque.size());
            } else if (line.startsWith("6")) {
                if (deque.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (line.startsWith("7")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(deque.getFirst());
                }
            } else if (line.startsWith("8")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(deque.getLast());
                }
            }
        }
    }
}