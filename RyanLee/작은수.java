// 백준 10871

import java.util.Scanner;

public class 작은수 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int[] num = new int[x];
        
        for (int i = 0; i < x; i++){
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < x; i++){
            if (num[i] < y){
                 System.out.print(num[i] + " ");
        } 
    }
        scan.close();
    }
}

