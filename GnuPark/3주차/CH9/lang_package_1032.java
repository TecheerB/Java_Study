import java.io.*;
import java.util.*;

public class lang_package_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt((br.readLine()));

        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            input[i] = st.nextToken();

        }
        for (int i = 0; i < input[0].length(); i++) {
            boolean dif = false;

            for (int j = 1; j < n; j++) {
                if (input[0].charAt(i) != input[j].charAt(i)) {
                    dif = true;
                }
            }
            if (dif)
                System.out.print('?');
            else
                System.out.print(input[0].charAt(i));

        }

    }
}