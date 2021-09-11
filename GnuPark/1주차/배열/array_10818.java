import java.util.Scanner;

public class array_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 1000000;
        int max = 0;
        int[] array = new int[sc.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
        }
        System.out.printf("%d %d", min, max);
    }
}
