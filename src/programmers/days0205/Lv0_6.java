package programmers.days0205;

import java.util.Scanner;

/*
 
  문제 설명
  두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.

  a + b = c
 */
public class Lv0_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d",a,b, a + b);
    } 
}
