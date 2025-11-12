import java.util.*;
import java.io.*;

public class Main {

    static int N;
    static int[] arr;
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        StringTokenizer numSt = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(numSt.nextToken());
        }

        int[] cal = new int[4];
        StringTokenizer calSt = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            cal[i] = Integer.parseInt(calSt.nextToken());
        }

        dfs(1, arr[0], cal);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    static void dfs(int depth, int num, int[] cal) {
        if (depth == N) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (cal[i] == 0) continue;

            int[] tmpArr = cal.clone();
            tmpArr[i]--;

            int next = num;

            switch (i) {
                case 0:
                    next = num + arr[depth];
                    break;
                case 1:
                    next = num - arr[depth];
                    break;
                case 2:
                    next = num * arr[depth];
                    break;
                case 3:
                    if (num < 0)
                        next = - (Math.abs(num) / arr[depth]);
                    else
                        next = num / arr[depth];
                    break;
            }

            dfs(depth + 1, next, tmpArr);
        }
    }
}
