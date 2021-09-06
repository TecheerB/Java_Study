import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class problem11382 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            try {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");

                // 범위가 10^12 까지 : BigInteger 필요
                // long로 해결할 수 있지만, 정수 범위가 무한이 될 경우를 고려하여 BigInteger를 활용하는 것이 필요
                // BigInteger은 문자열 형태이기 때문에 숫자의 범위가 무한하다.

                BigInteger A = new BigInteger(st.nextToken());
                BigInteger B = new BigInteger(st.nextToken());
                BigInteger C = new BigInteger(st.nextToken());

                System.out.println(A.add(B.add(C)));
                break;
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
