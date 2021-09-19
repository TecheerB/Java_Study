import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[26];

        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }

        String str = br.readLine();

        for(int j=0; j<str.length(); j++){
            char c = str.charAt(j);
            if(arr[c-'a'] == -1){
                arr[c-'a'] = j;
            }
        }

        for(int e : arr){
            System.out.print(e + " ");
        }

    }
}
