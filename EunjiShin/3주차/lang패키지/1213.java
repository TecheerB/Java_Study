import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int [] abc = new int[26];
        for(int i=0; i<str.length(); i++){
            abc[str.charAt(i) - 'A']++;
        }

        // 팰린드롬 - 거꾸로 읽어도 똑같은 문자
        // 문자열 길이가 짝수 = 모든 알파벳 개수 짝수
        // 문자열 길이가 홀수 = 하나의 알파벳 개수 홀수 (가운데)

        int Odd = 0, OddIndex = 0;
        for(int i=0; i<abc.length; i++){
            if(abc[i] % 2 == 1){
                // 홀수면
                Odd++;
                OddIndex = i;
            }
        }

        if ((str.length() % 2 == 0 && Odd > 0) || (str.length() % 2 == 1 && Odd != 1)) {
            System.out.print("I'm Sorry Hansoo");
            return;
        }

        String result = "";
        for(int i=0; i<abc.length; i++){
            for(int j=0; j<abc[i]/2; j++){
                result += ((char)(i+'A'));
            }
        }

        String reverse = (new StringBuffer(result)).reverse().toString();
        if(Odd == 1) {
            result += ((char)(OddIndex+'A'));
        }

        System.out.print(result + reverse);

    }

}
