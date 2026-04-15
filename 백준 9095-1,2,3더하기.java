import java.io.*;


class oneplustwoplusthree {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str==null) return;
        int num = Integer.parseInt(str);
        
        for(int i = 0; i<num; i++){
            String str1 = br.readLine();
            if(str1 == null) return;
            int num1 = Integer.parseInt(str1);
            int arr[] = new int[11];
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 4;

            for (int e = 4; e<11; e++){
                arr[e] = arr[e-1] + arr[e-2] + arr[e-3];
            }
            System.out.println(arr[num1]);
        }
    }
}
