import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Yaks{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str == null) return;
        int ther = 0;
        Queue<Integer> q = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(str, " ");
        if (!st.hasMoreTokens()) return;
        int num1 = Integer.parseInt(st.nextToken());
        if (!st.hasMoreTokens()) return;
        int num2 = Integer.parseInt(st.nextToken());
        for(int i = 1; i < num1+1; i++){
            if(num1%i == 0){
                q.add(i);
            }
        }
        if (q.size() < num2){
            ther = 0;
        }
        else{
            for(int i = 0; i < num2; i++){
                ther = q.poll();
            }
        }
        System.out.println(ther);
    }
}
