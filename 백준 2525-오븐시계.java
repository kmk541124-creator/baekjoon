import java.io.*;
import java.util.*;

class oventime{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (str == null) return;
        
        StringTokenizer st = new StringTokenizer(str, " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        String str2 = br.readLine();
        if (str2 == null) return;
        int num3 = Integer.parseInt(str2);
        int time = 0;
        int total = num3 + num2;
        if(total >= 60){

            time = total/60;
            total %= 60;
        }
        int total_time = time+num1;
        if(total_time >= 24){
            total_time %= 24;
        }

        System.out.println(total_time + " " + total);
    }
}