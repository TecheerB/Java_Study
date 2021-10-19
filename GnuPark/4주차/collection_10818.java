import java.io.*;
import java.util.*;

public class collection_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = -1000000;
        int min = 1000000;
        int[] numList = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            numList[i] = Integer.parseInt(st.nextToken());

            if (numList[i] > max)
                max = numList[i];
            if (numList[i] < min)
                min = numList[i];
        }

        System.out.printf("%d %d", min, max);
    }
}
