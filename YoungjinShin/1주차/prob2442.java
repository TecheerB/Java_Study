import java.util.Scanner;

public class prob2442 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();
        int maxStar = 2 * a -1;
        int empty = 0;
        for (int i = 1; i <= a; i ++){
            empty = (maxStar - (i * 2-1))/2;
            System.out.println(" ".repeat(empty)+"*".repeat(i * 2 - 1));
        }

    }
}
