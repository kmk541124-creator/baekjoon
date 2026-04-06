import java.io.*;
import java.util.*;

@SuppressWarnings("all")
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String line = br.readLine();
            if (line == null || line.equals(".")) break;
            
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;
            
            OUTER:
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                switch (c) {
                    case '(', '[' -> stack.push(c);
                    case ')' -> {
                        if (stack.isEmpty() || stack.peek() != '(') {
                            isBalanced = false;
                            break OUTER;
                        }
                        stack.pop();
                    }
                    case ']' -> {
                        if (stack.isEmpty() || stack.peek() != '[') {
                            isBalanced = false;
                            break OUTER;
                        }
                        stack.pop();
                    }
                    default -> {
                    }
                }
            }
            
            if (isBalanced && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}