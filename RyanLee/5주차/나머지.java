//백준 3052
import java.util.Scanner;

public class 나머지{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = new int[10];
        int x = 0;
        int count = 0;
    
        for (int a = 0; a < 10; a++) {
          num[a] = scan.nextInt() % 42;
        }
    
        for (int b = 0; b < 10; b++) {
          x = 0;
          for (int c = b+1; c<10; c++) {
            if (num[b] == num[c]) {
              x++;
            }
          }
          if (x == 0) {
            count++;
          }
        }
        System.out.println(count);
    }
}