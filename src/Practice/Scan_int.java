package Practice;

import java.util.Scanner;

public class Scan_int {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in); //System.in은 표준 입력 스트림을 사용하여 사용자로부터 입력을 받기 위함

        System.out.printf("a를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.printf("b를 입력하세요 : ");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.printf("a + b = " + sum);
    }
}
