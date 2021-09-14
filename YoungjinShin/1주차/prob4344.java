import java.util.Scanner;

public class prob4344 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        int student[];

        for (int i= 0; i< cases; i ++){
            int stu = sc.nextInt();
            student = new int[stu];
        
        double sum = 0;
        double avg = 0;

            for (int j = 0; j < stu; j ++){
                int val = sc.nextInt();
                student[j] = val;
                sum += val;
            }
          
            avg = sum /stu;
            double count = 0;

            for(int k = 0; k < stu; k ++){
                if(student[k]> avg){
                    count ++;
                }
            }

            double fin = (count / stu);
            System.out.printf("%.3f%%\n", fin*100);

        
        }
    sc.close();
    }
}
