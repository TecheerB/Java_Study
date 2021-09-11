import java.util.Scanner;

public class array_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String string = sc.next();
            int count = 0;
            int sum = 0;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
