package stage02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2022.10.29 (토)
// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
// 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
public class Baekjoon_9498 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(bufferedReader.readLine());

        String result = score >= 90 ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C" : (score >= 60 ? "D" : "F")));

        System.out.println(result);

    }
}

//========================= memo ==========================//
