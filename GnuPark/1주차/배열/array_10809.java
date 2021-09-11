import java.util.Scanner;

public class array_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String alpha = sc.next();

        int[] alphaLowCase = new int[26];
        for (int i = 0; i < 26; i++) {
            alphaLowCase[i] = -1;
        }
        for (int i = 0; i < alpha.length(); i++) {
            int alpha_ascii = alpha.charAt(i);
            if (alphaLowCase[alpha_ascii - 97] == -1)
                alphaLowCase[alpha_ascii - 97] = i;
        }
        for (int i = 0; i < 26; i++) {
            System.out.printf("%d ", alphaLowCase[i]);
        }
    }
}
