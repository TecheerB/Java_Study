import java.io.*;
import java.util.*;

public class collection_10828 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int inputValue = Integer.parseInt(st.nextToken());
                    stack.push(inputValue);
                    break;
                case "top":
                    if (stack.size() == 0) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(stack.peek());
                    break;
                case "pop":
                    if (stack.size() == 0) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(stack.pop());
                    break;
                case "empty":
                    if (stack.empty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;

            }

        }
    }
}
