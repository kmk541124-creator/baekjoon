import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Math.*;
import java.util.Arrays;

class Main{
    public static void main(String[] agrs) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            String str2 = br.readLine();
            int num2 = Integer.parseInt(str2);
            arr[i] = num2;
        }

        Arrays.sort(arr);

        double d = arr.length * 0.15;

        int index = (int) round(d);

        for(int i = 0; i<index; i++){
            arr[i] = 0;
        }
        for(int i = arr.length - 1; i > arr.length - 1 - index; i--){
            arr[i] = 0;
        }
        int sum = 0;
        for (int j : arr) {

            sum = j + sum;
        }

        double average = (double) sum / (num - index * 2);
        sum = (int) Math.round(average);
        System.out.println(sum);
    }
}