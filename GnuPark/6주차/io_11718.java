import java.io.*;

public class io_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String words = "";

        while ((words = br.readLine()) != null) {
            System.out.println(words);
        }

    }
}
