import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class fuckdfs {
    @SuppressWarnings("unused")
    static int[][] graph;
    static boolean[] visited;
    static int N, M, V;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str == null) return;
        
        StringTokenizer st = new StringTokenizer(str, " ");
        N = Integer.parseInt(st.nextToken()); //정점 개수
        M= Integer.parseInt(st.nextToken()); //간선 개수
        V = Integer.parseInt(st.nextToken()); //시작 번호
        graph = new int[N + 1][N + 1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }

        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();

        // 3. BFS 수행 및 결과 출력
        visited = new boolean[N + 1];
        bfs(V);

        
    }    

    static void dfs(int node){
    visited[node] = true;
    System.out.print(node + " "); 

    for (int i = 1; i <= N; i++) {
        if (graph[node][i] == 1 && !visited[i]) {
            dfs(i);
        }
    }
}

    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int i = 1; i <= N; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}