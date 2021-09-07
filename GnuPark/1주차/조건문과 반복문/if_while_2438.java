
//별찍기 - 1
import java.util.Scanner;

public class if_while_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j < n; j++) {
                System.out.printf(String.valueOf("*"));

            }
            System.out.printf("\n");
        }
    }
}
