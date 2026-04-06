import java.io.*;
import java.util.*;

@SuppressWarnings("all") 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nLine = br.readLine();
        if (nLine == null) return;
        int n = Integer.parseInt(nLine.trim());
        
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input == null) break;
            
            StringTokenizer st = new StringTokenizer(input);
            if (!st.hasMoreTokens()) continue;

            String cmd = st.nextToken();

            switch (cmd) {
                case "push" -> {
                    if (st.hasMoreTokens()) {
                        queue.add(Integer.valueOf(st.nextToken()));
                    }
                }
                case "pop" -> {
                    if (queue.isEmpty()) sb.append("-1\n");
                    else sb.append(queue.poll()).append("\n");
                }
                case "size" -> sb.append(queue.size()).append("\n");
                case "empty" -> sb.append(queue.isEmpty() ? "1\n" : "0\n");
                case "front" -> {
                    if (queue.isEmpty()) sb.append("-1\n");
                    else sb.append(queue.peekFirst()).append("\n");
                }
                case "back" -> {
                    if (queue.isEmpty()) sb.append("-1\n");
                    else sb.append(queue.peekLast()).append("\n");
                }
            }
        }
        System.out.print(sb.toString());
    }
}