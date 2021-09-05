// 백준 1330

import java.util.Scanner;

public class 두수 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a = 0;
            int b = 0;

            a = scan.nextInt();
            b = scan.nextInt();
            scan.close();

            if (a > b){
                System.out.println(">");
        }
            if (a < b){
                System.out.println("<");
        }
            if (a == b){
                System.out.println("==");
            }
        }
}
