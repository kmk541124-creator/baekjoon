import java.io.*;
import java.util.*;

class shortstreet {
    static int[][] arr;
    static int[][] dist;
    static int N, M;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        dist = new int[N][M];

        int startRow = 0, startCol = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int e = 0; e < M; e++) {
                arr[i][e] = Integer.parseInt(st.nextToken());
                if (arr[i][e] == 2) { // 시작점 찾기
                    startRow = i;
                    startCol = e;
                }
            }
        }

        // 갈 수 있는 땅은 일단 -1로 초기화
        for (int i = 0; i < N; i++)
            for (int e = 0; e < M; e++)
                if (arr[i][e] != 0) dist[i][e] = -1;

        bfs(startRow, startCol);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int e = 0; e < M; e++) {
                sb.append(dist[i][e]);
                if (e < M - 1) sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    static void bfs(int startRow, int startCol) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startRow, startCol});
        dist[startRow][startCol] = 0; // 시작점은 0

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int row = cur[0];
            int col = cur[1];

            for (int i = 0; i < 4; i++) {
                int nrow = row + dx[i];
                int ncol = col + dy[i];

                if (nrow < 0 || nrow >= N || ncol < 0 || ncol >= M) continue;
                if (arr[nrow][ncol] == 0) continue;  // 벽
                if (dist[nrow][ncol] != -1) continue; // 이미 방문

                dist[nrow][ncol] = dist[row][col] + 1;
                q.add(new int[]{nrow, ncol});
            }
        }
    }
}