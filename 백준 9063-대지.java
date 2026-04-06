import java.io.*;
import java.util.StringTokenizer;

class grand{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str==null) return;
        int xmax = -10001;
        int xmine = 10001;
        int ymax = -10001;
        int ymine = 10001;
        int sum;
        int num = Integer.parseInt(str);
        int[] arr = new int[num];
        int[] arr2 = new int[num];
        for(int i = 0; i<num; i++){
            String str1 = br.readLine();
            if(str1 == null) return;
            StringTokenizer st = new StringTokenizer(str1, " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            arr[i] = num1;
            arr2[i] = num2;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > xmax){
                xmax = arr[i];
            }
            if(arr[i] < xmine){
                xmine = arr[i];
            }
            if(arr2[i] < ymine){
                ymine = arr2[i];
            }
            if(arr2[i] > ymax){
                ymax = arr2[i];
            }
        }
        sum = (xmax - xmine) * (ymax - ymine);
        System.out.println(sum);
    }
}
