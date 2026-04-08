import java.io.*;

class stair{
    public static void main(String[] args) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str == null) return;
        int n = Integer.parseInt(str);
        int[] score = new int[n + 1];
        int[] dp = new int[n + 1];
        int sum;
        for(int i = 1; i <= n; i++){
            String str1 = br.readLine();
            if(str1 == null) return;
            int num = Integer.parseInt(str1);
            score[i] = num;
        }

        if (n >= 1) dp[1] = score[1];
        if (n >= 2) dp[2] = score[1] + score[2];

        for(int i = 3; i < n+1; i++){
            dp[i] = Math.max(dp[i-3]+score[i-1]+score[i], dp[i-2]+score[i]);
        }

        sum = dp[n];

        System.out.println(sum);
    }
}
