import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        String str = reader.readLine();
        int count = 0;
        int[] dp = new int[M];
 
        Arrays.fill(dp, 0);
 
        for (int i = 2; i < M; i++) {
            String temp = str.substring(i - 2, i + 1);
            if (temp.equals("IOI")) {
                dp[i] = dp[i - 2] + 1;
            }
            if (dp[i] >= N) {
                count++;
            }
        }
        System.out.println(count);
    }
}