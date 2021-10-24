import java.io.*;
import java.util.*;

public class problem5525 {
    public static void main(String[] args) throws IOException{
        // Pn에 O는 n개 들어있다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] loc = new int [M];
        char[] arr = br.readLine().toCharArray();
        int result = 0;

        for(int i = 2; i < M; i++){
            // I, O, I 패턴 일때
            if(arr[i] == 'I' && arr[i-1] == 'O' && arr[i-2] == 'I'){
                loc[i] = loc[i-2] + 1;

                if(loc[i] >= N){
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
