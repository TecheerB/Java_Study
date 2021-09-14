import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class problem10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int i = 0;
        int max = 0, min = 0;
        int [] arr = new int [n];


        // 배열 사용 + sort 사용
//        while(st.hasMoreTokens()){
//            arr[i] = Integer.parseInt(st.nextToken());
//            i++;
//        }
//
//        Arrays.sort(arr);
//        max = arr[n-1]; min = arr[0];
//        System.out.print(min + " " + max);


         // 직접 비교 : 제일 빠름 
        while(st.hasMoreTokens()){
            arr[i] = Integer.parseInt(st.nextToken());
            if(i == 0){
                max = arr[i];
                min = arr[i];
            }else{
                if(arr[i] > max) { max = arr[i]; }
                if(arr[i] < min) { min = arr[i]; }
            }
            i++;
        }

        System.out.print(min + " " + max);


    }
}
