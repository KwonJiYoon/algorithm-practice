package stage03;

import java.io.*;

// 2022.11.05 (일)

// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
// 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

public class Baekjoon_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j <= N - i; j++) {
               bufferedWriter.write(" ");
            }
            for (int k = 0; k < i; k++) {
                bufferedWriter.write("*");
            }
            bufferedWriter.write("\n");
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

}

//========================= memo ==========================//

