import java.util.Scanner;

public class prob2588 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        String lengthb = Integer.toString(b);

        int mult = 0;
        int ret = a * b;
        int rem = 0;
        for (int i = 0; i < lengthb.length(); i ++){
            rem = b % 10;
            b /= 10;
            mult = a * rem;
            System.out.println(mult);
        }
        System.out.println(ret);
    }
}
