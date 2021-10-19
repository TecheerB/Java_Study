import java.io.*;
import java.util.*;

public class problem18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Deque<Integer> dq = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        while(n-- > 0){
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()){
                case "push":
                    dq.offer(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    Integer a = dq.poll();
                    if(a != null){
                        sb.append(a).append('\n');
                    }else{
                        sb.append(-1).append('\n');
                    }
                    break;

                case "size":
                    sb.append(dq.size()).append('\n');
                    break;

                case "empty":
                    if(dq.isEmpty()){
                        sb.append(1).append('\n');
                    }else{
                        sb.append(0).append('\n');
                    }
                    break;

                case "front":
                    Integer b = dq.peek();
                    if(b != null){
                        sb.append(b).append('\n');
                    }else{
                        sb.append(-1).append('\n');
                    }
                    break;

                case "back":
                    Integer c = dq.peekLast();
                    if(c != null){
                        sb.append(c).append('\n');
                    }else{
                        sb.append(-1).append('\n');
                    }
                    break;
            }
        }

        System.out.println(sb);
    }
}
