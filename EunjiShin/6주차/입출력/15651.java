import java.io.*;
import java.util.*;

public class problem15651 {
    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());

        arr = new int [M];
        bfs(0);
        System.out.println(sb);

    }

    public static void bfs(int depth) throws IOException{
        // 다 골랐다면
        if(depth == M){
            for(int i = 0; i < M; i++){
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = 0; i < N; i++){
            // 뽑은 친구를 결과에 대입
            arr[depth] = i+1;
            // 재귀로 다음 결과 탐색
            bfs(depth+1);
        }
    }
}
