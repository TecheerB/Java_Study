import java.io.*;

public class problem2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        String str = String.valueOf(result);

        int [] arr = new int[10];

        for(int i=0; i<str.length(); i++){
            arr[(str.charAt(i) - 48)]++;
        }

        for(int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }

    }
}
