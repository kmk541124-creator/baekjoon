import java.io.*; // 선언하는거, *표시는 io에 있는 모든 메소드를 다 가져오겠다는 뜻
import java.util.*;

class fastab{
    public static void main(String[] args) throws Exception{ //throws Exception으로 예외 처리 이거 안하면 오류남
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 클래스를 br로 생성
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) { //BufferedWiriter 생성 및 try로 예외 처리 사실 안해도 되는데 vscode에서 try 안쓰면 빨간줄뜸 그냥 보기 좋으라고 한거
            String str = br.readLine(); //입력 받는거 BufferedReader로 한거 그 줄에 있는 입력을 그대로 받음
            if(str == null) return; //예외처리, 만약 입력 받은게 아무것도 없다면 종료한다는뜻
            int num = Integer.parseInt(str); // 입력받은걸 숫자로 전환
            for(int i = 0; i < num; i++){ //입력 받은 숫자 만큼 반복
                String str1 = br.readLine(); //위에꺼와 동일
                StringTokenizer st = new StringTokenizer(str1, " "); // 공백을 기준으로 입력 받은 문자열을 자름
                int num1 = Integer.parseInt(st.nextToken()); //공백을 기준으로 자른거 하나를 덩어리 취급해서 정수형으로 변환
                int num2 = Integer.parseInt(st.nextToken()); //위와 동일
                bw.write((num1 + num2) + "\n"); //System.out.println를 쓰면 속도가 느려서 시간초과 발생함, 그래서 BUfferedWriter를 사용해서 빠르게 출력하는거 println과는 다르게 줄바꿈을 따로 해주지 않아서 \n으로 줄바꿈 직접 해줘야됨
            }

            bw.flush(); //BufferdWirter는 print와 다르게 한꺼번에 모아서 출력하는거 그래서 이 코드로 남아 있는 값을 다 출력하는거임
            bw.close(); //창고로 예를들면 창고 안에있는 값을 모조리 다 출력하고 난뒤 창고 문을 닫는거임
        }
    }
}
