import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str == null) return;
        
        StringTokenizer st = new StringTokenizer(str, " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int nownumber = 0;
        int[] arr = new int[num1];
        int[] arr2 = new int[num1];

        for(int e = 0; e < num1; e++){
            arr[e] = e + 1;
        }

        for(int i = 0; i < num1; i++){
            int count = 0;
            while (true) {
                if (arr[nownumber] != 0) {
                    count++;
                }
                if (count == num2) break;
                nownumber = (nownumber + 1) % num1;
            }
            arr2[i] = arr[nownumber];
            arr[nownumber] = 0;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < arr2.length; i++){
            sb.append(arr2[i]);
            if (i < arr2.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb.toString());
    }
}