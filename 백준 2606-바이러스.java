import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

class virus{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str == null) return;
        int num = Integer.parseInt(str);
        String str2 = br.readLine();
        if(str2 == null) return;
        int num2 = Integer.parseInt(str2);
        int[][] arr = new int[num+1][num+1];
        boolean[] visted = new boolean[num+1];
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for(int i = 0; i < num2; i++){
            String str3 = br.readLine();
            if(str3 == null);
            StringTokenizer st = new StringTokenizer(str3, " ");
            if (!st.hasMoreTokens()) return;
            int num3 = Integer.parseInt(st.nextToken());
            if (!st.hasMoreTokens()) return;
            int num4 = Integer.parseInt(st.nextToken());
            arr[num3][num4] = 1;
            arr[num4][num3] = 1;
        }

        stack.push(1);
        visted[1] = true;

        while(!stack.empty()){
            int connet = stack.pop();
            for(int i = 1; i<=num; i++){
                if(arr[connet][i] == 1 && !visted[i]){
                    count++;
                    visted[i] = true;
                    stack.push(i);
                }
            }
        }
        System.out.println(count);
    }
}