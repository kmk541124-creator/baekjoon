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
        int[][] arr = new int[num1][num2];
        int[][] arr2 = new int[num1][num2];

        for (int i = 0; i < num1; i++) {
        // 1. 한 줄을 통째로 읽어와서 공백(" ") 기준으로 자릅니다.
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
            for (int j = 0; j < num2; j++) {
                // 2. 잘려진 토큰을 하나씩 숫자로 변환해 배열의 i행 j열에 저장합니다.
                arr[i][j] = Integer.parseInt(st1.nextToken());
            }
        }
        
        for (int i = 0; i < num1; i++) {
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
            for (int j = 0; j < num2; j++) {
                // 2. 잘려진 토큰을 하나씩 숫자로 변환해 배열의 i행 j열에 저장합니다.
                arr2[i][j] = Integer.parseInt(st1.nextToken());
            }
        }

        int[][] result = new int[num1][num2];
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                // 3. 두 배열의 같은 위치에 있는 숫자들을 더해서 새로운 배열에 저장합니다.
                result[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                // 4. 결과 배열을 출력할 때, 각 숫자 사이에 공백을 넣어서 출력합니다.
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
        
    
}
