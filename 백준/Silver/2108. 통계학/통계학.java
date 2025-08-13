import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];
        int[] freq = new int[8001];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        long sum = 0L;

        for (int i = 0; i < N; i++) {
            int v = Integer.parseInt(br.readLine());
            nums[i] = v;
            sum += v;
            freq[v + 4000]++;

            if (v < min) min = v;
            if (v > max) max = v;
        }

        Arrays.sort(nums);

        int avg = (int) Math.round((double) sum / N);
        int middle = nums[N / 2];
        int maxFreq = 0;
        for (int f : freq) maxFreq = Math.max(maxFreq, f);

        int mode = 0;
        int found = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) {
                found++;
                mode = i - 4000;
                if (found == 2) break;
            }
        }

        int range = max - min;

        StringBuilder sb = new StringBuilder();
        sb.append(avg).append('\n')
          .append(middle).append('\n')
          .append(mode).append('\n')
          .append(range).append('\n');

        System.out.print(sb);
    }
}
