package stage1;

import java.util.Scanner;

public class Baekjoon_10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B;
        A = sc.nextInt();
        B = sc.nextInt();

        sc.close();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
    }
}
