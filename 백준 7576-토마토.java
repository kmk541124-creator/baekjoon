import java.io.*;
import java.util.*;

class tomato{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str == null) return;
        StringTokenizer st = new StringTokenizer(str," ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int[][] arr = new int[num2][num1];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < num2; i++){
            st = new StringTokenizer(br.readLine());
            for(int e = 0; e < num1; e++){
                arr[i][e] = Integer.parseInt(st.nextToken());
                if(arr[i][e] == 1) q.add(new int[]{i,e});
            }
        }
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        int day = 0;

        while(!q.isEmpty()){
            int size = q.size();
            boolean change = false;
            for(int i = 0; i < size; i++){
                int[] cur = q.poll();
                int row = cur[0], col = cur[1];
                for(int d = 0; d < 4; d++){
                    int nrow = row + dx[d];
                    int ncol = col + dy[d];
                    if(nrow < 0 || nrow >= num2 || ncol < 0 || ncol >= num1) continue;
                    if(arr[nrow][ncol] != 0) continue;
                    arr[nrow][ncol] = 1;
                    q.add(new int[]{nrow, ncol});
                    change = true;
                }
            }
            if(change) day++;
        }

        boolean possible = true;
        for(int i = 0; i < num2; i++){
            for(int e = 0; e < num1; e++){
                if(arr[i][e] == 0) possible = false;
            }
        }
        if(possible){
            System.out.println(day);
        } else {
            System.out.println(-1);
        }
    }
}