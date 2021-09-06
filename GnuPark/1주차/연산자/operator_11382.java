import java.util.Scanner;

public class operator_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long sum = 0;

        for (int i = 0; i < 3; i++) {
            long input = sc.nextLong();
            sum += input;
        }
        System.out.println(sum);
    }
}