//백준 10818

import java.util.Scanner;

public class 최소최대{
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] val = new int[n];

        int min = 1000001;
        int max = -100000;

        for (int x = 0; x < n; x++){
            val[x] = scan.nextInt();
            if (max < val[x]){
                max = val[x];
            }
            if (min > val[x]){
                min = val[x];
            }
        }
        System.out.print(min + " " + max);
    }
}