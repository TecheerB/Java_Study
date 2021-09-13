import java.util.Scanner;

public class prob2577 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int retnum = 1;
        for(int i = 0; i<3; i ++){
            retnum *= sc.nextInt();
        }

        sc.close();

        String a = Integer.toString(retnum);


        for (int j = 0; j < 10; j ++){
            int count = 0;
    
            for (int k = 0; k < a.length(); k++){
                if (a.charAt(k) - '0' == j){
                    count ++;
                }
            }
            System.out.println(count);
        }

    }
}
