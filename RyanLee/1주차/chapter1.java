// 백준 10869

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);

            int a = read.nextInt();
            int b = read.nextInt();

            read.close();

            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);

        }
}
