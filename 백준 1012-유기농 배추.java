import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Main {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str == null || str.trim().isEmpty()) return;
        int num = Integer.parseInt(str);
        for(int i = 0; i < num; i++){
            String str2 = br.readLine();
            if (str2 == null || str2.trim().isEmpty()) return;

            StringTokenizer st = new StringTokenizer(str2, " ");
            if (!st.hasMoreTokens()) return;
            int num1 = Integer.parseInt(st.nextToken());
            if (!st.hasMoreTokens()) return;
            int num2 = Integer.parseInt(st.nextToken());
            if(!st.hasMoreTokens()) return;
            int num3 = Integer.parseInt(st.nextToken());
            
            int[][] test = new int[num1][num2];
            boolean[][] visited = new boolean[num1][num2];

            for(int e = 0; e < num3; e++){
                String str3 = br.readLine();
                if (str3 == null || str3.trim().isEmpty()) return;
                StringTokenizer st2 = new StringTokenizer(str3, " ");
                if (!st2.hasMoreTokens()) return;
                int num4 = Integer.parseInt(st2.nextToken());
                if (!st2.hasMoreTokens()) return;
                int num5 = Integer.parseInt(st2.nextToken());
                test[num4][num5] = 1;
            }

            int count = 0;
            for(int x = 0; x < num1; x++) {
                for(int y = 0; y < num2; y++) {
                    if(test[x][y] == 1 && !visited[x][y]) {
                        bfs(test, visited, x, y, num1, num2);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void bfs(int[][] test, boolean[][] visited, int startX, int startY, int M, int N) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for(int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && nx < M && ny >= 0 && ny < N) {
                    if(test[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}