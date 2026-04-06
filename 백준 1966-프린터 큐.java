import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                queue.add(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int[] front = queue.poll();
                boolean isMax = true;

                for (int j = 0; j < queue.size(); j++) {
                    if (front[1] < queue.get(j)[1]) {
                        isMax = false;
                        break;
                    }
                }

                if (isMax) {
                    count++;
                    if (front[0] == M) {
                        System.out.println(count);
                        break;
                    }
                } else {
                    queue.add(front);
                }
            }
        }
    }
}