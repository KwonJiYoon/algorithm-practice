package stage03;
import java.io.*;
import java.util.StringTokenizer;

// 2022.11.05 (일)

// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
// 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

public class Baekjoon_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}

//========================= memo ==========================//

