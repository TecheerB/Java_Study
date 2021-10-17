import java.io.*;
import java.util.*;

public class lambda_stream_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] targetArr = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            targetArr[i] = arr[i] % 42;
        }

        for (int i = 0; i < 10; i++) {
            int temp = 0;
            for (int j = i + 1; j < 10; j++) {
                if (targetArr[i] == targetArr[j]) {
                    temp++;
                }
            }
            if (temp == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
