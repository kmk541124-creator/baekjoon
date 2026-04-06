import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str == null || str.trim().isEmpty()) return;
        int num = Integer.parseInt(str);
        int[][] arr = new int[100][100];
        int count = 0;
        for(int i = 0; i < num; i++){
            String st2= br.readLine();
            if (st2 == null || st2.trim().isEmpty()) return;
            StringTokenizer st = new StringTokenizer(st2, " ");
            if (!st.hasMoreTokens()) return;
            int num1 = Integer.parseInt(st.nextToken());
            if (!st.hasMoreTokens()) return;
            int num2 = Integer.parseInt(st.nextToken());
            for(int j = 0; j < 10; j++){
                for(int j2 = 0; j2 < 10; j2++){
                    arr[num1 + j][num2 + j2] = 1;
                }
            }
        }
        for(int i = 0; i <100; i++){
            for(int j =0; j < 100; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}