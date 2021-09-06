import java.io.*;

public class problem2588 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            try {
                int A = Integer.parseInt(br.readLine());
                int B = Integer.parseInt(br.readLine());

                System.out.println(A*(B%10));
                System.out.println(A*(B%100/10));
                System.out.println(A*(B/100));
                System.out.println(A*B);

                break;
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
