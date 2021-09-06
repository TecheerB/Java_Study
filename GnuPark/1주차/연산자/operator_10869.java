import java.util.Scanner;

public class operator_10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();

        for (int i = 2; i >= 0; i--) {
            System.out.println(a * Integer.parseInt(String.valueOf(b.charAt(i))));
        }
        System.out.println(a * Integer.parseInt(String.valueOf(b)));
    }

}
