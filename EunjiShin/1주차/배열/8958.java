import java.io.*;
import java.util.StringTokenizer;

public class problem8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            int count = 0, sum = 0;
            String tc = br.readLine();

            for(int j=0; j<tc.length(); j++){
                if(tc.charAt(j) == 'O'){
                    count++;
                    sum += count;
                }
                else{
                    count = 0;
                }
            }

            System.out.println(sum);
        }

    }
}
