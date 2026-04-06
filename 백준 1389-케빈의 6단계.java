import java.io.*;
import java.util.*;

class kevein{
    static int[][] arr;      // 친구 관계를 저장할 인접 행렬
    static int num1;         // 유저의 수 (N)
    static int num2;         // 친구 관계의 수 (M)
    @SuppressWarnings("unused")
    static int[] distance;   // 각 유저까지의 거리를 저장할 배열

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str == null) return;

        StringTokenizer st = new StringTokenizer(str, " ");
        num1 = Integer.parseInt(st.nextToken()); // N
        num2 = Integer.parseInt(st.nextToken()); // M

        // 1. 배열 크기는 반드시 유저 수(num1) + 1로 설정!
        arr = new int[num1 + 1][num1 + 1];

        for (int i = 0; i < num2; i++) {
            String line = br.readLine();
            if (line == null) break;
            StringTokenizer st1 = new StringTokenizer(line, " ");
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());

            // 친구 관계는 양방향입니다.
            arr[a][b] = arr[b][a] = 1;
        }

        int minKevinBacon = Integer.MAX_VALUE; // 가장 작은 케빈 베이컨 수
        int answerUser = 0;                    // 정답 유저 번호

        // 2. 모든 유저(1번부터 num1번까지)에 대해 각각 BFS를 수행합니다.
        for (int i = 1; i <= num1; i++) {
            int totalDistance = bfs(i);
            
            // 가장 작은 케빈 베이컨 수를 가진 사람을 찾습니다.
            // 값이 같으면 번호가 작은 사람이 우선이므로 < 를 사용합니다.
            if (totalDistance < minKevinBacon) {
                minKevinBacon = totalDistance;
                answerUser = i;
            }
        }

        System.out.println(answerUser);
    }

    static int bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        // 거리를 저장할 배열 (동시에 방문 체크 역할도 함)
        // -1로 초기화하여 방문하지 않은 곳을 구분합니다.
        int[] dist = new int[num1 + 1];
        Arrays.fill(dist, -1);

        q.add(start);
        dist[start] = 0; // 자기 자신까지의 거리는 0

        int sum = 0;

        while (!q.isEmpty()) {
            int current = q.poll();

            for (int i = 1; i <= num1; i++) {
                // 연결되어 있고, 아직 방문하지 않았다면 (dist가 -1이라면)
                if (arr[current][i] == 1 && dist[i] == -1) {
                    dist[i] = dist[current] + 1; // 이전 사람 거리 + 1
                    sum += dist[i];             // 전체 거리 합에 추가
                    q.add(i);
                }
            }
        }
        return sum; // 이 사람이 다른 모든 사람에게 도달하는 거리의 총합
    }
}