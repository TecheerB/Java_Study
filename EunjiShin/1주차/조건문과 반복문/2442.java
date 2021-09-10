import java.io.*;
import java.util.Scanner;

public class problem2442 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 출력 에러??
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N - i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= (2 * i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
