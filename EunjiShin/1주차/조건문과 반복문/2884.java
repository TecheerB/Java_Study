import java.io.*;
import java.util.StringTokenizer;

public class problem2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        System.out.println( (M >= 45) ? H + " " + (M-45) : ( (H == 0) ? 23 + " " + (15+M) : (H-1) + " " + (15+M)) );

    }
}
