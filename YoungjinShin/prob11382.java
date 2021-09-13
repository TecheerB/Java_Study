import java.util.Scanner;

public class prob11382{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long retSum = 0;

        for (int i =0; i < 3 ; i++){
            long input = sc.nextLong();
            retSum += input;
        }
        sc.close();

        System.out.println(retSum);
    }
}