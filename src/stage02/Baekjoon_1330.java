package stage02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2022.10.29 (토)
// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
// 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
public class Baekjoon_1330 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] stringArr = new String[0];
        try {
            stringArr = bufferedReader.readLine().split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int A = Integer.parseInt(stringArr[0]);
        int B = Integer.parseInt(stringArr[1]);

        String result = A > B ? ">" : (A < B ? "<" : "==");

        System.out.println(result);
    }
}

//========================= memo ==========================//

// ▫️ Scanner 보다 BufferReader의 성능이 더 빠름

// ❓ readLine()은 왜 Exception 처리를 해줘야 할까?
//    👉🏻 readLine()에서 throwsException을 하는 이유는 InputStream == null일 때의 장애를 대비해서 미리 예외처리를 해줘야 한다.
