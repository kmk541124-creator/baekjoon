import java.io.*;

class makeone{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // dp[i]는 숫자 i를 1로 만드는 최소 횟수
        int[] dp = new int[n + 1];

        // 0과 1은 연산이 필요 없으므로 0 (자바 배열은 기본이 0)
        for (int i = 2; i <= n; i++) {
            // 1. 일단 1을 빼는 경우를 기본으로 생각함 (이전 숫자 횟수 + 1)
            dp[i] = dp[i - 1] + 1;

            // 2. 만약 2로 나눠진다면, "1 뺀 것" vs "2로 나눈 것" 중 더 작은 쪽 선택
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // 3. 만약 3으로 나눠진다면, "현재 저장된 값" vs "3으로 나눈 것" 중 더 작은 쪽 선택
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[n]);
    }
}