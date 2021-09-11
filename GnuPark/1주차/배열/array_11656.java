import java.io.*;
import java.util.*;

public class array_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력을 한 줄로 받아야 하므로 공백으로 문자열 분리
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String word = st.nextToken();
        char[] wordArray = word.toCharArray();
        ArrayList<String> wordList = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            char[] suffixes = new char[word.length() - i];

            for (int j = i; j < word.length(); j++) {
                suffixes[j - i] = wordArray[j];
            }
            String suffixesWord = new String(suffixes);
            wordList.add(suffixesWord);
        }
        wordList.sort(String::compareTo);

        for (int i = 0; i < word.length(); i++) {
            System.out.println(wordList.get(i));
        }
    }
}
