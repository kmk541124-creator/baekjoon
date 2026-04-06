import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    static Stack<Integer> stack = new Stack<>();
    
    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        if (str == null) return;
        int num = Integer.parseInt(str.trim());
        
        for(int i = 0; i < num; i++){
            String command = br.readLine();
            StringTokenizer st = new StringTokenizer(command, " ");
            if(!st.hasMoreTokens()) continue;
            String var1 = st.nextToken();
            
            if("push".equals(var1)){
                String var2 = st.nextToken();
                ush(var2);
            }
            else if("top".equals(var1)){
                System.out.println(op());
            }
            else if("size".equals(var1)){
                System.out.println(ize());
            }
            else if("empty".equals(var1)){
                System.out.println(ty());
            }
            else if("pop".equals(var1)){
                System.out.println(po());
            }
        }
    }

    public static void ush(String s){
        int num2 = Integer.parseInt(s);
        stack.push(num2);
    }
    
    public static int op(){
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }
    
    public static int ize(){
        return stack.size();
    }
    
    public static int ty(){
        return stack.isEmpty() ? 1 : 0;
    }
    
    public static int po(){
        if(stack.isEmpty()){
            return -1;
        }
        return stack.pop();
    }
}