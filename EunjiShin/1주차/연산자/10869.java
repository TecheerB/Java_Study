import java.io.*;
        import java.util.Scanner;
        import java.util.StringTokenizer;

public class problem10869 {
    public static void main(String[] args) throws IOException{
        /*
         * 계산 할 두 자연수를 입력한다.
         * BufferReader를 쓴 이유 : Buffer를 이용하므로 Scanner에 비해 빠르다.
         * ( 키보드가 입력할 때마다 한 문자씩 버퍼로 전송 & 버퍼 꽉 차거나 개행문자 있을 때 버퍼 한번에 전송)
         * Scanner : 키보드 입력과 동시에 바로 전송
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력을 한 줄로 받아야 하므로 공백으로 문자열 분리
        while(true) {
            try {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");

                // 문자열이니까 타입 변환
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                // 입력 조건 체크
                if(A >= 1 && B <= 10000) {

                    System.out.println(A + B);
                    System.out.println(A - B);
                    System.out.println(A * B);
                    System.out.println(A / B);
                    System.out.println(A % B);

                    break;
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}