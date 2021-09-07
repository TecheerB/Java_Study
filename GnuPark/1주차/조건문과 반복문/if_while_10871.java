import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class if_while_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수열의 길이
        int x = sc.nextInt(); // 비교군
        sc.close();
        int[] sequence = new int[n];
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
            if (sequence[i] < x)
                result.add(sequence[i]);
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.printf("%d ", result.get(i));
        }
    }
}
