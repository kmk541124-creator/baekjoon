import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class multipl {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str == null) return;

            StringTokenizer st = new StringTokenizer(str, " ");
            if (!st.hasMoreTokens()) return;
            int num1 = Integer.parseInt(st.nextToken());
            if (!st.hasMoreTokens()) return;
            int num2 = Integer.parseInt(st.nextToken());

            if (num1 == 0 && num2 == 0) {
                break;
            }

            if (num1 > num2) {
                if (num1 % num2 == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }
            } else if (num2 > num1) {
                if (num2 % num1 == 0) {
                    System.out.println("factor");
                } else {
                    System.out.println("neither");
                }
            }
        }
    }
}