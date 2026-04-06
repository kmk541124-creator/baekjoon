import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int num = Integer.parseInt(str);

        for(int i =0; i<num; i++){
            System.out.println(solve(br.readLine()));
        }
    }

    public static String solve(String s){
        Stack<Character> stack = new Stack<>();

        for (int j =0; j<s.length(); j++){
            char c = s.charAt(j);

            if (c == '('){
                stack.push(c);
            }
            else if (stack.empty()){
                return "NO";
            }
            else{
                stack.pop();
            }

        }
        if(stack.empty()){
            return "YES";
        }else{
            return "NO";
        }

    }
}