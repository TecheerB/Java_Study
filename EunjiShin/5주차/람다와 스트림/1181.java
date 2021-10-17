import java.io.*;
import java.util.*;

public class problem1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        // 중복 제거 방법 - HashSet, LinkedHashSet, TreeSet, 반복문 돌면서 직접 제거
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            set.add(st.nextToken());
        }

        ArrayList<String> list = new ArrayList<>(set);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() - o2.length() == 0){
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for(String str : list){
            System.out.println(str);
        }

    }
}
