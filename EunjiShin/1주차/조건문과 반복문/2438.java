import java.io.*;
import java.util.Scanner;

public class problem2438 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
