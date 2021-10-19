import java.io.*;
import java.util.*;

public class problem10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        for(int i = 0; i < arr.length; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        // 나이가 증가하는 순으로
        // 나이 같으면 먼저 가입한 사람이 앞으로
        // 그럼 나이 같은 경우는 고려할 필요 X 어차피 순서대로 들어오니까

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< n; i++){
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }

        System.out.println(sb);
    }
}
