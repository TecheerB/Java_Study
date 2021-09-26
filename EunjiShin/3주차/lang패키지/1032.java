import java.io.*;

public class problem1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean flag = true;
        String str[] = new String[n];
        String result = "";

        for(int i = 0; i < n; i++){
            str[i] = br.readLine();
        }

        for(int i = 0; i < str[0].length(); i++){
            for(int j = 0; j < n; j++){
                if(str[0].charAt(i) == str[j].charAt(i)) {
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
            if(!flag) { result += "?"; }
            else { result += str[0].charAt(i); }
        }
        System.out.println(result);
    }
}
