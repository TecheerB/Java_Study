
import java.util.Scanner;
import static java.lang.System.out;

public class prob1213{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String initial = sc.next();
        sc.close();

        StringBuffer sb = new StringBuffer();

        int len = initial.length();
        int[] letter = new int[26];

        for(int i = 0; i<len; i++){
            letter[initial.charAt(i) -'A']++;
        }

        int odd = 0;
        int ret  = 0;
        for(int i = 0; i<26; i ++){
           if (letter[i]%2 != 0){
               odd ++;
               ret = i;
           }
        }
        
        if (odd>1 || (len %2 == 0 && odd == 1)){
            out.println("I'm Sorry Hansoo");
            return;
        }
        
        for(int i = 0; i< 26; i++){
            if (letter[i] % 2 == 0){
                while((letter[i]/2) >0 ){
                    sb.append((char)(i +'A'));
                    letter[i] --;
                } 
            }
        }
        
        if(len % 2 == 0){
            out.println(sb.toString()+ sb.reverse());
        }else{
            out.println(sb.toString() + (char)(ret + 'A') + sb.reverse().toString());
        }
    }
}
