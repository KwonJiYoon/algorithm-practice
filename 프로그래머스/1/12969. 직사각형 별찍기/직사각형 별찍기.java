import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        // 예상되는 문자열 크기 미리 지정
        StringBuilder sb = new StringBuilder(b * (a + 1)); 

        // 한 줄을 미리 생성
        String row = "*".repeat(a) + "\n"; 

        for (int i = 0; i < b; i++) {
            sb.append(row);
        }

        // 마지막 개행 제거 없이 출력
        System.out.print(sb);
    }
}
