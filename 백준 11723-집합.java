import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        
        // 명령어를 저장할 맵 (if문 대신 사용)
        Map<String, Consumer<StringTokenizer>> commands = new HashMap<>();
        
        commands.put("add", st -> set.add(Integer.valueOf(st.nextToken())));
        commands.put("remove", st -> set.remove(Integer.valueOf(st.nextToken())));
        commands.put("check", st -> sb.append(set.contains(Integer.valueOf(st.nextToken())) ? "1\n" : "0\n"));
        commands.put("toggle", st -> {
            int v = Integer.parseInt(st.nextToken());
            if (!set.remove(v)) set.add(v); // 내부 로직용 최소한의 if (구조적 if-else 아님)
        });
        commands.put("all", st -> {
            set.clear();
            for (int k = 1; k <= 20; k++) set.add(k);
        });
        commands.put("empty", st -> set.clear());

        int num = Integer.parseInt(br.readLine().trim());

        while (num-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            
            // 여기서 if-else 없이 맵에서 바로 꺼내서 실행함
            commands.get(op).accept(st);
        }
        System.out.print(sb);
    }
}