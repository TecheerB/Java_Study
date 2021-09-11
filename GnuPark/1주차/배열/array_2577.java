import java.util.Scanner;

public class array_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int number = a * b * c;
        int[] array = new int[10];

        while (number > 0) {
            array[number % 10]++;
            number /= 10;
        }

        for (int element : array) {
            System.out.println(element);
        }

    }
}