
import java.io.*;
import java.util.*;
class Sosu{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int low;
        int sum = 0;
        if(str == null) return;
        int num = Integer.parseInt(str);
        String str2 = br.readLine();
        if(str2 == null) return;
        int num2 = Integer.parseInt(str2);
        Queue<Integer> q = new LinkedList<>();
        for(int i = num; i<num2+1; i++){
            int count = 0;
            for(int e = 1; e<(i+1); e++){
                if(i%e == 0){
                    count += 1;
                }
            }
            if(count == 2){
                q.add(i);
            }
            
        }
        if(q.isEmpty()){
            System.out.println(-1);
        }
        else{
            low = q.poll();
            sum += low;
            while(q.isEmpty() != true){
                sum += q.poll();
            }
            System.out.println(sum);
            System.out.println(low);
        }   
    }
}
