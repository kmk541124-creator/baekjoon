import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        if (str == null || str.trim().isEmpty()) return;
        
        StringTokenizer st = new StringTokenizer(str, " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        
        int arr[] = new int[num1];
        for(int i = 0; i < num1; i++){
            String str2 = br.readLine();
            if (str2 == null || str2.trim().isEmpty()) continue;
            arr[i] = Integer.parseInt(str2);
        }

        int count = 0;
        int e = num1 - 1; 
        
        while(num2 > 0 && e >= 0){
            if(arr[e] <= num2){
                count += num2 / arr[e];
                num2 %= arr[e];
            }
            e--; 
        }
        
        System.out.println(count);
    }
}