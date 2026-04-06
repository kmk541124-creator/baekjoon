import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str == null || str.trim().isEmpty()) return;

        StringTokenizer st = new StringTokenizer(str, " ");
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(solve((int) Math.pow(2, N), r, c));
    }

    static int solve(int size, int r, int c) {
        if (size == 1) return 0;

        int half = size / 2;
        int area = half * half;

        if (r < half && c < half) {
            return solve(half, r, c);
        } else if (r < half && c >= half) {
            return area + solve(half, r, c - half);
        } else if (r >= half && c < half) {
            return 2 * area + solve(half, r - half, c);
        } else {
            return 3 * area + solve(half, r - half, c - half);
        }
    }
}