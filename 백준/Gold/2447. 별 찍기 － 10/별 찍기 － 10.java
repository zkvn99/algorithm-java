import java.util.*;
import java.io.*;

public class Main {
    
    static char[][] board;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        board = new char[n][n];
        fillStar(0, 0, n, false);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(board[i][j]);
            }
            bw.write("\n");
        }
        
        bw.flush();
    }
    
    static void fillStar (int x, int y, int size, boolean blank) {
        
        if (blank) {
            for (int i = x; i < x + size; i++) {
                for (int j = y; j < y + size; j++) {
                    board[i][j] = ' ';
                }
            }
            return;
        }
        
        if (size == 1) {
            board[x][y] = '*';
            return;
        }
        
        int newSize = size / 3;
        int count = 0;
        for (int i = x; i < x + size; i += newSize) {
            for (int j = y; j < y + size; j += newSize) {
                count++;
                if (count == 5) {
                    fillStar(i, j, newSize, true);
                } else {
                    fillStar(i, j, newSize, false);
                }
            }
        }
    }
}