
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
class Main
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception 
    {
        

        System.out.println(solove());

    }

    public static int solove() throws Exception
    {
        Stack<Integer> a = new Stack<>();
        String inputLine = br.readLine();
        if (inputLine == null || inputLine.trim().isEmpty()) return 0;
        
        int num = Integer.parseInt(inputLine.trim());
        for(int e =0; e < num; e++){
            String num2 = br.readLine();
            if(num2 == null) break;
            int num3 = Integer.parseInt(num2);
            if(num3 == 0){
            a.pop();
            }
            else{
            a.push(num3);
            }
        }
        int sum = 0;
        while (!a.isEmpty()) {
        sum += a.pop(); 
        }
        
        return sum;
    }   
}