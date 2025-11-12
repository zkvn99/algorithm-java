import java.util.*;
import java.io.*;

public class Main {
    
    static int N;
    static boolean[][] arr;
    static int white;
    static int blue;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        arr = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if (tmp == 1) arr[i][j] = true;
                else arr[i][j] = false;
            }
        }
        
        recursion(0, 0, N);
        
        System.out.println(white);
		System.out.println(blue);
    }
    
    static void recursion(int row, int col, int size) {
        
        if (isCheck(row, col, size)) {
            if (arr[row][col]) blue++;
            else white++;
            return;
        }
        
        size = size / 2;
        
        recursion(row, col + size, size);
        recursion(row, col, size);
        recursion(row + size, col, size);
        recursion(row + size, col + size, size);
    }
    
    static boolean isCheck(int row, int col, int size) {
        
        boolean tmp = arr[row][col];
        
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (arr[i][j] != tmp) return false;
            }
        }
        
        return true;
    }

}