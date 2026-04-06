import java.io.*;
import java.util.StringTokenizer;

class trythreeline{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) { 
            String str = br.readLine();
            if(str == null) return;
            StringTokenizer st = new StringTokenizer(str, " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());
            int max = 0;
            if(num1 == 0 && num2 == 0 &&num3 == 0){
                break;
            }
            boolean real = false;
            if(num1>max){
                max = num1;
                real = num3+num2>max;
            }
            if(num2>max){
                max = num2;
                real = num1+num3>max;
            }
            if(num3>max){
                max = num3;
                real = num2+num1>max;
            }
            if(real){
                if(num1 == num2 && num2 == num3){
                    System.out.println("Equilateral");
                }
                else if(num1 == num2 || num2 == num3 || num3 == num1){
                    System.out.println("Isosceles");
                }
                else{
                    System.out.println("Scalene");
                }
            }   
            else{   
                System.out.println("Invalid");
            }

        }
    }
}
