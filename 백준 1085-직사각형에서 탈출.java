import java.io.*;
import java.util.*;

class Nemoline{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str == null) return;
        int reult = 1000000;

        StringTokenizer st = new StringTokenizer(str, " ");
        
        if (st.countTokens() >= 4) {
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());
            int num4 = Integer.parseInt(st.nextToken());
            
            if(num4 - num2 < reult){
                reult = num4 - num2;
            }
            if(num2 < reult){
                reult = num2;
            }
            if(num1 < reult){
                reult = num1;
            }
            if(num3-num1 < reult){
                reult = num3-num1;
            }
            System.out.println(reult);
        }
    }
}