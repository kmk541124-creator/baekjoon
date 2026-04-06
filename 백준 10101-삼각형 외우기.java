import java.io.*;

class triremember{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str == null) return;
        int num1 = Integer.parseInt(str);
        String str1 = br.readLine();
        if(str1 == null) return;
        int num2 = Integer.parseInt(str1);
        String str2 = br.readLine();
        if(str2 == null) return;
        int num3 = Integer.parseInt(str2);

        if(num1 == 60 && num2 == 60 && num3 == 60){
            System.out.println("Equilateral");
        }

        else if (num1 + num2 + num3 == 180 && (num1 == num2 || num2 == num3 || num3 == num1)) {
            System.out.println("Isosceles");
        }
        else if(num1+num2+num3 == 180){
            System.out.println("Scalene");
        }
        else{
            System.out.println("Error");
        }
    }
}
