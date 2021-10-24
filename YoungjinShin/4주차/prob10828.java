import java.util.*;
import static java.lang.System.out;

public class prob10828{
    public static void main(String[] args){

        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int fun = sc.nextInt();

        for(int i =0 ; i<fun; i++){
            String func = sc.next();
            switch(func){
                case "push":
                    int pushNum = sc.nextInt();
                    stack.push(pushNum);
                    break;
                case "pop":
                    if(stack.empty()==true){
                        out.println(-1);
                        break;
                    }else{
                        out.println(stack.pop());
                        break;
                    }

                case "size":
                    out.println(stack.size());
                    break;

                case "empty":
                    if(stack.empty() == true){
                        out.println(1);
                        break;
                    }else{
                        out.println(0); 
                        break;
                    }
        
                case "top":
                    if(stack.empty() == true){
                        out.println(-1);
                        break;
                    }else{
                        out.println(stack.peek());
                        break;
                    }
                
            }
        }

        
    }
    

    public static int empty(Stack<Integer> stack){
        if(stack.empty() == true){
            return 1;
        }else{
            return 0;
        }

    }

    public static int top(Stack<Integer> stack){
        if(stack.empty() == true){
            return -1;
        }else{
            return stack.peek();
        }
        
    }
}
