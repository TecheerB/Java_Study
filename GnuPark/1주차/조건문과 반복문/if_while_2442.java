import java.util.Scanner;

public class if_while_2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (j >= n - i && j <= n + i)
                    System.out.print("*");
                else if (j < n - i)
                    System.out.print(" ");

            }
            System.out.println("");
        }
    }
}
