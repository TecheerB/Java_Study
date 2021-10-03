import java.io.*;
        import java.util.*;

public class problem1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = str.length();
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for(int i=0; i<n; i++){
            leftStack.push(str.charAt(i));
        }

        while (m-- > 0){
            st = new StringTokenizer(br.readLine(), " ");
            switch(st.nextToken()){
                case "L":
                    if(!leftStack.isEmpty()){
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case "D":
                    if(!rightStack.isEmpty()){
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case "B":
                    if(!leftStack.isEmpty()){
                        leftStack.pop();
                    }
                    break;
                case "P":
                    String ch = st.nextToken();
                    leftStack.push(ch.charAt(0));
                    break;
            }
        }

        while(!leftStack.isEmpty()){
            rightStack.push(leftStack.pop());
        }
        while(!rightStack.isEmpty()){
            sb.append(rightStack.pop());
        }

        System.out.println(sb);
    }
}
