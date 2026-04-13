import java.io.*;
import java.util.*;

class fastab{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String str = br.readLine();
            if(str == null) return;
            int num = Integer.parseInt(str);
            for(int i = 0; i < num; i++){
                String str1 = br.readLine();
                StringTokenizer st = new StringTokenizer(str1, " ");
                int num1 = Integer.parseInt(st.nextToken());
                int num2 = Integer.parseInt(st.nextToken());
                bw.write((num1 + num2) + "\n");
            }

            bw.flush();
            bw.close();
        }
    }
}
