import java.util.Scanner;
import java.util.Stack;

public class array_2908 {
    public static Scanner sc = new Scanner(System.in);

    public static int ReversedNumber() {
        Stack<Integer> reversedNum = new Stack<>();
        int number = sc.nextInt();

        while (number > 0) {
            reversedNum.push(number % 10);
            number /= 10;
        }
        for (int i = 1; i <= 100; i *= 10) {
            number += (reversedNum.pop() * i);
        }
        return number;
    }

    public static void main(String[] args) {

        int firstNum = ReversedNumber();
        int secondNum = ReversedNumber();

        System.out.println(Math.max(firstNum, secondNum));
    }
}
