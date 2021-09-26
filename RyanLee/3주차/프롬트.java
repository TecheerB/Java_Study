import java.util.Scanner;
 
public class 프롬트 {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];
 
        for (int i = 0; i < n; i++) {
            str[i] = scan.next();
        }
 
        boolean dif = false;
 
        for (int i = 0; i < str[0].length(); i++) {
            dif = false;
            for (int j = 0; j < n - 1; j++) {
 
                if (str[j].charAt(i) != str[j + 1].charAt(i)) {
                    dif = true;
                    break;
                }
 
            }
 
            if (dif)
                System.out.print("?");
            else
                System.out.print(str[0].charAt(i));
 
        }
 
    }
 
}