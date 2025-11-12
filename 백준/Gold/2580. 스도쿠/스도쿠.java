import java.util.*;
import java.io.*;

public class Main {
    static int[][] puzzle = new int[9][9];
    static List<int[]> list = new ArrayList<>();
    static boolean solved;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                puzzle[i][j] = Integer.parseInt(st.nextToken());
                if (puzzle[i][j] == 0) {
                    list.add(new int[]{i, j});
                }
            }
        }
        
        dfs(0);
    }
    
    static void dfs(int depth) {
        
        if (depth == list.size()) {
            if (!solved) {
                print();
                solved = true;
                return;
            }
        }
        
        int[] pos = list.get(depth);
        int col = pos[0];
        int row = pos[1];
        
        for (int i = 1; i <= 9; i++) {
            if (valid(col, row, i)) {
                puzzle[col][row] = i;
                dfs(depth + 1);
                if (solved) return;
                puzzle[col][row] = 0;
            }
        }
    }
    
    static boolean valid(int col, int row, int value) {
        
        for (int i = 0; i < 9; i++) {
            if (puzzle[i][row] == value) return false;
            if (puzzle[col][i] == value) return false;
        }
        
        int c = col / 3 * 3;
        int r = row / 3 * 3;
        
        for (int i = c; i < c + 3; i++) {
            for (int j = r; j < r + 3; j++) {
                if (puzzle[i][j] == value) return false;
            }
        }
        
        return true;
    }
    
    static void print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(puzzle[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}