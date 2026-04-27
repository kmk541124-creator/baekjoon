import java.io.*;
import java.util.*;

class meetingroom{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str == null) return;
        int num = Integer.parseInt(str);
        int[][] meetings = new int[num][2];
        int now = 0;
        int count = 0;
        for(int i = 0; i < num; i++){
            String str1 = br.readLine();
            if(str1 == null) return;
            StringTokenizer st = new StringTokenizer(str1, " ");
            meetings[i][0] = Integer.parseInt(st.nextToken()); // 시작시간
            meetings[i][1] = Integer.parseInt(st.nextToken()); // 끝시간
        }

        Arrays.sort(meetings, (a, b) -> {
            if(a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });
        for(int i = 0; i<num; i++){
            if(meetings[i][0] >= now){
                now = meetings[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}