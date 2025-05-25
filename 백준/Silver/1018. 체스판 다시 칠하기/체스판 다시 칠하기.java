// 체스판의 최소 다시 칠하는 횟수를 계산하는 코드 예시
import java.util.*;
import java.io.*;

public class Main {
    static String[] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);

        board = new String[N];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine();
        }

        int result = 64;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                result = Math.min(result, getPaintCount(i, j));
            }
        }

        System.out.println(result);
    }

    static int getPaintCount(int x, int y) {
        String[] pattern = {"WBWBWBWB", "BWBWBWBW"};
        int count1 = 0;

        for (int i = 0; i < 8; i++) {
            String line = board[x + i];
            for (int j = 0; j < 8; j++) {
                if (line.charAt(y + j) != pattern[i % 2].charAt(j)) {
                    count1++;
                }
            }
        }

        return Math.min(count1, 64 - count1);
    }
}
