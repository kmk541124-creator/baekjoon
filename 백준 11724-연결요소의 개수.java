import java.io.*;
import java.util.*;

class countofline{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 정점의 개수
        int m = Integer.parseInt(st.nextToken()); // 간선의 개수

        // 1. 인접 리스트로 그래프 구현
        ArrayList<Integer>[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        // 2. 간선 정보 입력 (무방향 그래프)
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        boolean[] visited = new boolean[n + 1];
        int count = 0;

        // 3. 모든 정점을 순회하며 방문하지 않은 곳 탐색
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                count++; // 새로운 연결 요소(덩어리) 발견
                bfs(i, adj, visited);
            }
        }

        System.out.println(count);
    }

    // BFS 로직
    static void bfs(int start, ArrayList<Integer>[] adj, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int next : adj[now]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}