import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str == null || str.trim().isEmpty()) return;

        StringTokenizer st = new StringTokenizer(str, " ");
        if (!st.hasMoreTokens()) return;
        String num1 = st.nextToken();
        if (!st.hasMoreTokens()) return;
        int num2 = Integer.parseInt(st.nextToken());

        int decimal = Integer.parseInt(num1, num2);

        System.out.println(decimal);

    }
}
