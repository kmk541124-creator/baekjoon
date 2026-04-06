import java.io.*;

class Yaksu{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str == null) return;
        int count = 2;
        int num = Integer.parseInt(str);

        while(num != 1){
            if(num%count == 0){
                num /= count;
                System.out.println(count);
            }
            else if(num%count != 0){
                count++;
            }
        }
    }
}
