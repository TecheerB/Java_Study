// 백준 2349

import java.util.Scanner;

public class 별2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char star = '*';
        int numStars = scan.nextInt();

        scan.close();
        

        for (int i = 1; i <= numStars; i++){
            for (int j = 1; j <= numStars-i; j++){
                System.out.print(" ");
            }
            for (int x = 0; x < i; x++) {
                System.out.print(star);
            }
            System.out.print("\n");
        }



    }
    
}
