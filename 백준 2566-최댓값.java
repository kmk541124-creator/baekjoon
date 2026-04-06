import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = 0;
        int maxinrow = 1;
        int maxincol = 1;
        for (int i = 0; i < 9; i++) {
        // 1. 한 줄을 통째로 읽어와서 공백(" ") 기준으로 자릅니다.
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
            for (int j = 0; j < 9; j++) {
                // 2. 잘려진 토큰을 하나씩 숫자로 변환해 배열의 i행 j열에 저장합니다.
                arr[i][j] = Integer.parseInt(st1.nextToken());
            }
        }
        for(int i = 0; i<9; i++){
            for(int e = 0; e<9; e++){
                if(arr[i][e] > max){
                    max = arr[i][e];
                    maxinrow = i+1;
                    maxincol = e+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxinrow + " " + maxincol);
    }
}

