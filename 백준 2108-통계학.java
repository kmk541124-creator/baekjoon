import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str == null || str.trim().isEmpty()) return;
        
        int num = Integer.parseInt(str);
        int[] arr = new int[num];
        double sum = 0;

        // 변수 이름을 j로 바꿔서 충돌을 피했습니다
        for (int j = 0; j < num; j++) {
            String line = br.readLine();
            if (line != null) {
                arr[j] = Integer.parseInt(line);
                sum += arr[j];
            }
        }

        Arrays.sort(arr);

        // 1. 산술평균
        System.out.println((int)Math.round(sum / num));

        // 2. 중앙값
        System.out.println(arr[num / 2]);

        // 3. 최빈값
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int maxFreq = 0;
        for (int f : map.values()) {
            maxFreq = Math.max(maxFreq, f);
        }

        ArrayList<Integer> modes = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == maxFreq) {
                modes.add(key);
            }
        }
        Collections.sort(modes);

        if (modes.size() > 1) {
            System.out.println(modes.get(1));
        } else {
            System.out.println(modes.get(0));
        }

        // 4. 범위
        System.out.println(arr[num - 1] - arr[0]);
    }
}