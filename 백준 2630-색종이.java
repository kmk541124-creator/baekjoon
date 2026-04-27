import java.io.*;
import java.util.*;

class makecolorpaper{
    static int[][] arr;
    static int white = 0, blue = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str == null) return;
        int num = Integer.parseInt(str);
        arr = new int[num][num];
        for(int i = 0; i < num; i++){
            String str1 = br.readLine();
            if(str1 == null) return;
            StringTokenizer st = new StringTokenizer(str1);
            for(int e = 0; e < num; e++){
                arr[i][e] = Integer.parseInt(st.nextToken());
            }
        }
        solve(0, 0, num); // while 대신 재귀 호출
        
        System.out.println(white);
        System.out.println(blue);
    }
    static void solve(int row, int col, int size){
        int first = arr[row][col];
        boolean same = true;
        
        for(int i = row; i < row + size; i++){
            for(int e = col; e < col + size; e++){
                if(arr[i][e] != first){
                    same = false;
                    break;
                }
            }
            if(!same) break;
        }
        
        if(same){
            if(first == 0) white++;
            else blue++;
            return;
        }
        
        int half = size / 2;
        solve(row,        col,        half);
        solve(row,        col + half, half);
        solve(row + half, col,        half);
        solve(row + half, col + half, half);
    }
}