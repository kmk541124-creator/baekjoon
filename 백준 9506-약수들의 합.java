import java.io.*;
import java.util.*;

class Yakplus {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str == null) break;
            
            int num = Integer.parseInt(str);
            if (num == -1) break;

            int sum = 0;
            Queue<Integer> q = new LinkedList<>();
            
            // 자기 자신(num)을 제외한 약수만 큐에 넣고 합산
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    q.add(i);
                    sum += i;
                }
            }

            if (sum == num) {
                System.out.print(num + " = ");
                // 큐가 빌 때까지 반복
                while (!q.isEmpty()) {
                    int val = q.poll();
                    if (q.isEmpty()) {
                        System.out.println(val);
                    } else {
                        System.out.print(val + " + ");
                    }
                }
            } else {
                System.out.println(num + " is NOT perfect.");
            }
        }
    }
}