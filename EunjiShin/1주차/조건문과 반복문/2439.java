import java.io.*;
import java.util.Scanner;

public class problem2439 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            for(int k=0; k<N; k++) {
                System.out.print((k < N - i) ? " " : "*");
            }
            System.out.print("\n");
        }

    }
}
