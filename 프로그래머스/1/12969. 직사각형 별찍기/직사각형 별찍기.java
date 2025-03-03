import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 문자열을 미리 생성하여 성능 최적화
        String row = "*".repeat(a);

        // 반복문을 사용하여 출력
        for (int i = 0; i < b; i++) {
            System.out.println(row);
        }
    }
}