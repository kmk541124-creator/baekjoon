import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        if (str == null) return;
        
        int n = Integer.parseInt(str);
        int count = 0;

        while (true) {
            if (n % 5 == 0) {
                count += (n / 5);
                System.out.println(count);
                break;
            }
            
            n -= 3;
            count++;
            
            if (n < 0) {
                System.out.println(-1);
                break;
            }
        }
    }
}