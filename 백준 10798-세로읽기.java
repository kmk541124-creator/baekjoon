import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int e = 0; e < 15; e++){
            for(int i=0; i < 5; i++){
                if(arr[i][e] != '\u0000'){
                    sb.append(arr[i][e]);
                }
            }
        }

        System.out.println(sb.toString());
    }
}                                                        

