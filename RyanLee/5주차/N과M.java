//백준 15651
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N과M{
    static int N, M;
	static int[] num;
    static StringBuilder builder = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		N = Integer.parseInt(tokenizer.nextToken());
		M = Integer.parseInt(tokenizer.nextToken());
		num = new int[M];
		dfs(1, 0);
		System.out.print(builder);
	}

	public static void dfs(int at, int depth) {
		if (depth == M) {
			for (int value : num) {
				builder.append(value).append(" ");
			}
			builder.append("\n");
			return;
		}
		for (int i = at; i <= N; i++) {
			num[depth] = i;
			dfs(1 , depth + 1);
		}
    }
}