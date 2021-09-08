import java.io.*;
import java.util.StringTokenizer;

public class problem10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        // StringTokenizer로 토큰을 입력 받음과 동시에 X와 비교한다
        // 문자열 추가 : '+' , substring(), StringBuilder.append() 이용

        // (방법 1) String result = "";
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num < X){
                // (방법 1) result += num + " ";
                sb.append(num).append(' ');
            }
        }
        // (방법 1) System.out.println(result);
        System.out.println(sb);

    }
}
