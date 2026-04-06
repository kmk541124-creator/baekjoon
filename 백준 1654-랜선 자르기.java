import java.io.*;
import java.util.*;

class lansuncut {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int K = Integer.parseInt(st.nextToken()); // 가진 랜선 수
        int N = Integer.parseInt(st.nextToken()); // 필요한 랜선 수
        
        long[] arr = new long[K];
        long max = 0;
        
        for (int i = 0; i < K; i++) {
            arr[i] = Long.parseLong(br.readLine());
            if (arr[i] > max) max = arr[i];
        }

        long start = 1;
        long end = max; // 반드시 max를 구한 후 대입
        long result = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            if (mid == 0) mid = 1; // 0으로 나누기 방지
            
            long count = 0;
            for (long len : arr) {
                count += (len / mid);
            }

            if (count >= N) {
                result = mid; // 결과 저장
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(result);
    }
}