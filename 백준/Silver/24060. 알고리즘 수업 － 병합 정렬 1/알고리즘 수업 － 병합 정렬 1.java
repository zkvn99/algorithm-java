import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static int[] A, tmp;
    static long cnt = 0;
    static int answer = -1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N];
        tmp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

        mergeSort(0, N - 1);

        System.out.print(answer);
    }

    static void mergeSort(int left, int right) {
        if (left >= right) return;
        int mid = (left + right) >>> 1;
        mergeSort(left, mid);
        mergeSort(mid + 1, right);
        merge(left, mid, right);
    }

    static void merge(int left, int mid, int right) {
        int i = left, j = mid + 1, t = 0;

        while (i <= mid && j <= right) {
            if (A[i] <= A[j]) tmp[t++] = A[i++];
            else              tmp[t++] = A[j++];
        }
        while (i <= mid)   tmp[t++] = A[i++];
        while (j <= right) tmp[t++] = A[j++];

        for (int p = 0; p < t; p++) {
            A[left + p] = tmp[p];
            cnt++;
            if (cnt == K) answer = A[left + p];
        }
    }
}
