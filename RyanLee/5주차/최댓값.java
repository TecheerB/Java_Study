//백준 2562
import java.util.Scanner;

public class 최대값{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in); 
        int [] input =new int[9]; 
        int max=0; 
        int count=0; 
        for(int i=0;i<9;i++) { 
            input[i]=scan.nextInt(); 
        } 
        for(int i=0; i<9;i++) { 
            if(input[i]>max) { 
                max=input[i]; count=i+1; 
            } 
        } System.out.println(max); 
        System.out.println(count);
    }
}