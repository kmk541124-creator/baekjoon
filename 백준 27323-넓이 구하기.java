import java.io.*;

class nemo {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str == null) return;
        int num = Integer.parseInt(str);
        String str2 = br.readLine();
        if(str2 == null) return;
        int num1 = Integer.parseInt(str2);
        System.out.println(num*num1);

    }
}
