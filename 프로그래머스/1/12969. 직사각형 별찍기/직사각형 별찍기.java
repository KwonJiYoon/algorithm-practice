import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();

        // 한 줄을 미리 생성
        String row = new String(new char[a]).replace("\0", "*");

        for (int i = 0; i < b; i++) {
            sb.append(row).append("\n");
        }

        // 마지막 개행 제거
        System.out.print(sb.substring(0, sb.length() - 1));
    }
}