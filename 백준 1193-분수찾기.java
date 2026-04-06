import java.io.BufferedReader;
import java.io.InputStreamReader;

class Buns{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int now = 1;
        int up = 1;
        int down = 1;
        if(str == null) return;
        int num = Integer.parseInt(str);
        for(int i = 1; i < num; i++){
            if(now % 2 == 0){
                if(down - 1 == 0){
                    up++;
                    now++;
                    continue;
                }
                up++;
                down--;
            }
            else if(now %2 != 0){
                if(up - 1 == 0){
                    down++;
                    now++;
                    continue;
                }
                up--;
                down++;
            }
        }   
        System.out.println(up + "/" + down);
    }
}

