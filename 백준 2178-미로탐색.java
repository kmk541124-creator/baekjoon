import java.io.*;
import java.util.*;

class b{
    // 1. 전역 변수 설정 (함수 간 공유를 위해 static 사용)
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 이동용 x좌표
    static int[] dy = {0, 0, -1, 1}; // 상하좌우 이동용 y좌표
    static int[][] map;              // 미로 데이터 저장
    static boolean[][] visited;      // 방문 여부 체크
    static int N, M;                 // 미로 크기

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 2. 배열 초기화
        map = new int[N][M];
        visited = new boolean[N][M];

        // 3. 미로 입력 받기 (공백 없는 숫자들이므로 charAt 사용)
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        // 4. BFS 시작 (0, 0) 좌표부터 탐색
        bfs(0, 0);

        // 5. 도착 지점(N-1, M-1)까지의 최단 거리 출력
        System.out.println(map[N - 1][M - 1]);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            // 상하좌우 4방향 확인
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                // 지도 범위를 벗어나지 않는지 확인
                if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < M) {
                    // 아직 방문하지 않았고, 갈 수 있는 길(1)인 경우
                    if (!visited[nextX][nextY] && map[nextX][nextY] == 1) {
                        visited[nextX][nextY] = true;
                        
                        // 핵심: 다음 칸의 숫자를 '현재 칸 숫자 + 1'로 갱신 (거리 누적)
                        map[nextX][nextY] = map[nowX][nowY] + 1;
                        
                        queue.add(new int[]{nextX, nextY});
                    }
                }
            }
        }
    }
}