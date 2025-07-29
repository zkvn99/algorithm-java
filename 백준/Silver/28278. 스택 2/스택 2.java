import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayStack arrayStack = new ArrayStack(N);
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            if (line.startsWith("1")) {
                int num = Integer.parseInt(line.split(" ")[1]);
                arrayStack.push(num);
            } else {
                int command = Integer.parseInt(line);
                switch (command) {
                    case 2: arrayStack.pop(); break;
                    case 3: arrayStack.size(); break;
                    case 4: arrayStack.empty(); break;
                    case 5: arrayStack.peek(); break;
                }
            }
        }
    } 
}

class ArrayStack {
    int top;
    int size;
    int[] stack;
    public ArrayStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    
    public void push(int number) {
        stack[++top] = number;
    }
    
    public void pop() {
        if(top > -1) {
            int pop = stack[top];
            System.out.println(stack[top--]);
        } else {
            System.out.println(-1);
        }
    }
    
    public void peek() {
        if(top > -1) {
            System.out.println(stack[top]);
        } else {
            System.out.println(-1);
        }
    }
    
    public void empty() {
        if(top == -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    
    public void size() {
        System.out.println(top + 1);
    }
}


