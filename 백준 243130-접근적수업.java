import java.io.*;
import java.util.StringTokenizer;

class algorigemseven{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. f(n) = a1*n + a0 에서 a1과 a0 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        
        // 2. 양의 정수 c 입력
        int c = Integer.parseInt(br.readLine());
        
        // 3. n0 입력
        int n0 = Integer.parseInt(br.readLine());

        // 조건 1: a1 * n0 + a0 <= c * n0 (n0 지점에서 성립하는가)
        // 조건 2: a1 <= c (기울기가 c보다 작거나 같은가)
        if ((a1 * n0 + a0 <= c * n0) && (a1 <= c)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}