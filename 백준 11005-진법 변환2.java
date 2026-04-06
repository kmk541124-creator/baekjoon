import java.io.*;
import java.util.StringTokenizer;

class Gin {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        if (str == null) return;

        StringTokenizer st = new StringTokenizer(str);
        
        if (st.hasMoreTokens()) {
            int num1 = Integer.parseInt(st.nextToken());
            if (st.hasMoreTokens()) {
                int num2 = Integer.parseInt(st.nextToken());
                
                String result = Integer.toString(num1, num2);
                System.out.println(result.toUpperCase());
            }
        }
    }
}