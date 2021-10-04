import java.io.*;
import java.util.*;

public class problem7785 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name;
        String home;

        Set<String> set = new TreeSet<>();

        for(int i=0; i<n; i++){
            name = sc.next();
            home = sc.next();
            if(home.equals("enter")){
                set.add(name);
            }
            else{
                set.remove(name);
            }
        }

        for(Iterator<String> itr = ((TreeSet<String>) set).descendingIterator(); itr.hasNext();){
            System.out.println(itr.next());
        }

    }
}
