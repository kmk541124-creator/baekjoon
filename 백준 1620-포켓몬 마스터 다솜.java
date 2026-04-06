import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        String[] nameArr = new String[n + 1];
        Map<String, Integer> nameMap = new HashMap<>();
        
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            nameArr[i] = name;
            nameMap.put(name, i);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            
            if (Character.isDigit(query.charAt(0))) {
                int num = Integer.parseInt(query);
                sb.append(nameArr[num]).append("\n");
            } else {
                sb.append(nameMap.get(query)).append("\n");
            }
        }
        System.out.print(sb);
    }
}