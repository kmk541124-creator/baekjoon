import java.io.*;
import java.util.*;

class aplusb {
    public static void main(String[] args) throws IOException { //IOE예외 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input; //임시 그릇

        while ((input = br.readLine()) != null) {  //입력 받고 바로 while문으로 검토 및 반복 조건은 "만약 입력 받은게 비어있지 않다면"
            StringTokenizer st = new StringTokenizer(input); //쪼개기
            
            if (st.hasMoreTokens()) {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                System.out.println(a + b);
            }
        }
    }
}