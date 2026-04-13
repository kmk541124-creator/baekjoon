import java.io.*;
import java.util.*;

class passwordfind { // 백준 제출 시 클래스 이름은 Main이어야 합니다.
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
     
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        HashMap<String, String> map4 = new HashMap<>();

        // 3. N개의 사이트 정보 저장
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()); 
            String site = st.nextToken();
            String password = st.nextToken(); 
            map4.put(site, password);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            String targetSite = br.readLine();
            sb.append(map4.get(targetSite)).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}