import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        
        n = Integer.parseInt(line[0]);
        m = Integer.parseInt(line[1]);
        
        map = new int[n][m];
        visited = new boolean[n][m];
        
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }
        
        bfs(0,0);
        System.out.println(map[n-1][m-1]);
    }
    
    static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        visited[x][y] = true;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];
            
            for(int i=0; i<4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if(nx>=0 && ny>=0 && nx<n && ny<m){
                    if(!visited[nx][ny] && map[nx][ny]==1){
                        visited[nx][ny] = true;
                        map[nx][ny] = map[cx][cy] + 1;
                        q.offer(new int[]{nx,ny});
                    }
                }
            }
        }
    }
}