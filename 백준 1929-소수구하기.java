import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str == null || str.trim().isEmpty()) return;

        StringTokenizer st = new StringTokenizer(str, " ");
        if (!st.hasMoreTokens()) return;
        int num1 = Integer.parseInt(st.nextToken());
        if (!st.hasMoreTokens()) return;
        int num2 = Integer.parseInt(st.nextToken());
        
        find(num1, num2);
    }

    public static void find(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i < 2) continue;

            boolean isPrime = true;
            for (int e = 2; e * e <= i; e++) {
                if (i % e == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}