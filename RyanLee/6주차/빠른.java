//백준 15552

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class 빠른 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int row = Integer.parseInt(reader.readLine());
		
		StringTokenizer tokenizer;
		
		for (int i =0; i <row; i++) {
			tokenizer = new StringTokenizer(reader.readLine()," ");
			int a = Integer.parseInt(tokenizer.nextToken());
			int b = Integer.parseInt(tokenizer.nextToken());
			int sum = a+b;
			writer.write(sum + "\n");
		}
		reader.close();
		writer.close();
	}
}
