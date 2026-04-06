import java.io.*;
class Move{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str == null) return;
        int num = Integer.parseInt(str);
        int ne = 1;
        int jum = 4;
        int l = 0;
        for(int i = 0; i<num; i++){
            jum = jum + ne * 5;
            jum = jum - l;
            l *= 2;
            l += ne*4;
            ne = ne*4;
        }
        System.out.println(jum);
    }
}
