import java.util.Scanner;

public class array_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int studentNum = sc.nextInt();
            int[] scores = new int[studentNum];
            int sum = 0;
            float aveg = 0;
            int count = 0;

            for (int j = 0; j < studentNum; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }

            aveg = (float) sum / studentNum;
            for (int j = 0; j < studentNum; j++) {
                if ((float) scores[j] > aveg) {
                    count++;
                }
            }
            System.out.printf("%.3f%c\n", (float) count / studentNum * 100, 37);

        }
    }
}
