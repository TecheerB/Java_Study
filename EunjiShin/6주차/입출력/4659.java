import java.io.*;
import java.util.*;

public class problem4659 {
    public static void main(String[] args) throws IOException {

//        모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
//        모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
//        같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";

        while(!(input = br.readLine()).equals("end")){

            sb.append("<" + input + ">" + " is");
            if(!checkCondition(input)){
                sb.append(" not");
            }

            sb.append(" acceptable.").append("\n");

        }

        System.out.println(sb.toString());

    }

    public static boolean checkCondition(String str){
        // 조건 1. 모음 있는지 체크
        if(checkMo(str)){
            if(checkThree(str)){
                if(checkTwo(str)){
                    return true;
                }
            }
        }

        return false;
    }

    // 모음 확인하는 친구
    public static boolean checkMo(String str){
        char[] chArr = str.toCharArray();
        for(int i = 0; i < chArr.length; i++){
            // 모음 하나라도 있으면 true
            if(isMo(chArr[i])){
                return true;
            }
        }
        return false;
    }

    // 조건 2에서 활용하기 위해 모음 확인 분리
    public static boolean isMo(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }

    // 모음 혹은 자음이 연속으로 3개 오는지 확인하는 친구
    public static boolean checkThree(String str){
        char[] chArr = str.toCharArray();
        for(int i = 0; i < chArr.length-2; i++){
            if(isMo(chArr[i])){
                if(isMo(chArr[i+1]) && isMo(chArr[i+2])){
                    return false;
                }
            }
            else{
                if(!isMo(chArr[i+1]) && !isMo(chArr[i+2])){
                    return false;
                }
            }
        }
        return true;
    }


    //  같은 글자가 연속적으로 두번 오는지 확인하는 친구
    public static boolean checkTwo(String str){
        char[] chArr = str.toCharArray();
        for(int i = 0; i < chArr.length-1; i++){
            if(chArr[i] == chArr[i+1]){
                if(chArr[i] != 'e' && chArr[i+1] != 'o'){
                    return false;
                }
            }
        }
        return true;
    }



}
