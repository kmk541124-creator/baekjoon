import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    static HashSet<String> set = new HashSet<>();
    static List<String> result = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str == null || str.trim().isEmpty()) return;

        StringTokenizer st = new StringTokenizer(str, " ");
        if (!st.hasMoreTokens()) return;
        int num1 = Integer.parseInt(st.nextToken());
        if (!st.hasMoreTokens()) return;
        int num2 = Integer.parseInt(st.nextToken());

        for(int i = 0; i < num1; i++){
            String str2 = br.readLine();
            if(str2 == null || str2.trim().isEmpty()) continue;
            set.add(str2);
        }
        for(int i = 0; i < num2; i++){
            String str3 = br.readLine();
            if(str3 == null || str3.trim().isEmpty()) continue;
            if(set.contains(str3)){
                result.add(str3);
            }
        }

        System.out.println(result.size());
        Collections.sort(result);
        for(String s : result){
            System.out.println(s);
        }
    }
}
