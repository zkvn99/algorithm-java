import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(numbers[0]);
        q.offer(-numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            List<Integer> list = new ArrayList<>();
            while (!q.isEmpty()) {
                int n = q.poll();
                int x = n + numbers[i];
                int y = n - numbers[i];
                list.add(x);
                list.add(y);
            }
            
            for (int n : list) {
                q.offer(n);
            }
        }
        
        while (!q.isEmpty()) {
            if (q.poll() == target) answer++;
        }
        
        return answer;
    }
}