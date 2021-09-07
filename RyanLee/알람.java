// 백준 2884

import java.util.Scanner;

public class 알람 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int min = scan.nextInt();

        scan.close();
        
        if (hour == 0 && min < 45){
            hour = 23;
            System.out.println(hour + " " + (15+min));
        }
        else if (hour > 0 && min < 45){
            hour --;
            System.out.println(hour + " " + (15+min));
        }
        else if (min >= 45){
            System.out.println(hour + " " + (min-45));
        }



    }
    
}
