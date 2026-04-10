import java.io.*;
import java.util.*;

class colorpaper{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str==null) return;
        int num = Integer.parseInt(str);
        int[][] arr = new int[num][num];
        int blue = 0;
        int white = 0;
        int now = num;
        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < num; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(arr[i][j]){
                    
                }
            }
        }
    }
}