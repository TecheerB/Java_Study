// 백준 2577

import java.util.Scanner;

public class 개수 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            
            int a;
            int b;
            int c;

            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();

            int abc = (a * b * c);
            String str = Integer.toString(abc);

            scan.close();

            int length = String.valueOf(abc).length();

            for (int x = 0; x <= 9; x++){ 
                int count = 0;
                String z = Integer.toString(x);
                for (int y = 0; y < length; y++){ 
                    if (str.charAt(y) == z.charAt(0)){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
}
