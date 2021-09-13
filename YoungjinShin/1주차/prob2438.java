import java.util.Scanner;

public class prob2438 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();

        for (int i = 1; i <= a; i ++){
            System.out.println("*".repeat(i));
        }

    }
}
