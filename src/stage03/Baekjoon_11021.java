package stage03;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2022.11.05 (일)

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며,  각 줄에 A와 B가 주어진다. (0 < A, B < 10)

public class Baekjoon_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < N + 1; i ++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            stringBuilder.append("Case #" + i + ": ");
            stringBuilder.append(Integer.parseInt(stringTokenizer.nextToken()) + Integer.parseInt(stringTokenizer.nextToken()));
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }

}

//========================= memo ==========================//

