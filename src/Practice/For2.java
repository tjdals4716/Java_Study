package Practice;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("1부터 a까지 더하는 연산을 수행합니다. 원하는 a값을 입력하세요 : ");
        int a = scanner.nextInt();
        int sum = 0;

        for(int i = 1;i <= a;i++){
            sum += i; //~까지 더하고싶다면 +=, ~까지 곱하고싶다면 *= (sum, i 초기값 1로 설정해야 됨)
        }
        System.out.printf("1부터 %d까지의 합은 " + sum + "입니다.", a);
    }
}
