// 백준 4344

import java.util.Scanner;

public class 평균 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cases = scan.nextInt();
        int[] num;
        for(int i = 0; i < cases; i++) {
            int students = scan.nextInt();
            num = new int[students];
            
            double total = 0;

            for (int x = 0; x < students; x++){
                int scores = scan.nextInt();
                num[x] = scores;
                total += scores;
                }

            double avg = (total/students);
            double count = 0;

            for (int x = 0; x < students; x++){
                if (num[x] > avg){
                    count++;
                }
            } 
        System.out.printf("%.3f%%\n", ((count/students)*100));
        }
    scan.close();
    }
}

