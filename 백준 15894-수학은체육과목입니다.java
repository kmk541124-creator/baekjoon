import java.io.*;

class mathispe{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        long sum = 0;
        if(str == null) return;
        int num = Integer.parseInt(str);
        sum += num;
        sum += num*2;
        sum += 1;
        sum += num-1;
        System.out.println(sum);
    }
}
