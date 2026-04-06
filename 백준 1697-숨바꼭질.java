import java.io.*;
import java.util.*;

class sheepsekicath{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); // 수빈이 위치
        int K = Integer.parseInt(st.nextToken()); // 동생 위치

        if (N == K) {
            System.out.println(0);
            return;
        }

        int[] check = new int[100001];
        Queue<Integer> q = new LinkedList<>();

        q.add(N);
        check[N] = 1; 

        while (!q.isEmpty()) {
            int now = q.poll();

            int[] nextPositions = {now - 1, now + 1, now * 2};

            for (int next : nextPositions) {
                if (next == K) {
                    // 목표 지점 도달 시 현재까지의 시간 출력
                    System.out.println(check[now]);
                    return;
                }

                // 범위 내에 있고 처음 방문하는 곳이라면
                if (next >= 0 && next <= 100000 && check[next] == 0) {
                    q.add(next);
                    check[next] = check[now] + 1;
                }
            }
        }
    }
}