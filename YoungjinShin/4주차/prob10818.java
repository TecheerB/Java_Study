import java.util.Scanner;
import static java.lang.System.out;
import java.util.Arrays;

public class prob10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nums[] = new int[num];
    

        for(int i = 0; i<num; i++){
            int number = sc.nextInt();
            nums[i] = number;
        }
      
        Arrays.sort(nums);

        out.println(nums[0] + " " +  nums[nums.length-1]);

        sc.close();
    }
}
