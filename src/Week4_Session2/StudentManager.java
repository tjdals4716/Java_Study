//package Week4_Session2;
//
//import java.util.Scanner;
//
//public class StudentManager {
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        // 학생 정보 입력 받기
//        String name = inputName();
//        int koreanScore = inputScore("국어");
//        int englishScore = inputScore("영어");
//        int mathScore = inputScore("수학");
//
//        // 1. 총점 및 평균 계산, 총점은 정수로 계산하되 평균은 실수형으로 계산할 것
//
//
//        // 학점 계산
//        char grade = calculateGrade(averageScore);
//
//        // 결과 출력
//        printResult(name, koreanScore, englishScore, mathScore, totalScore, averageScore, grade);
//
//        scanner.close();
//    }
//
//    // 2. 이름 입력 메소드 (입력에 공백이 있는지 없는지 판단하여, 공백이 있으면 다시 입력받을 것)
//    public static String inputName() {
//
//    }
//
//    // 3. 점수 입력 메소드 (점수에 숫자 아닌 것이 입력 안되도록, 0-100 사이 숫자만 입력되도록 제한할 것)
//    public static int inputScore(String subject) {
//
//    }
//
//    // 4. 학점 계산 메소드 (~95 A+, ~ 90 A, ~85 B+, ~ 80 B, ~75 C+, ~70 C, ~65 D+, ~ 60 D, 이하 F)
//    public static char calculateGrade(double averageScore) {
//
//    }
//
//    // 5. 결과 출력 메소드
//    public static void printResult(String name, int koreanScore, int englishScore, int mathScore, int totalScore, double averageScore, char grade) {
//        System.out.println("\n==== 학생 성적 정보 ====");
//        System.out.println("이름: " + name);
//        System.out.println("국어: " + koreanScore);
//        System.out.println("영어: " + englishScore);
//        System.out.println("수학: " + mathScore);
//        System.out.println("총점: " + totalScore);
//        System.out.printf("평균: %.2f\n", averageScore);
//        System.out.println("학점: " + grade);
//    }
//}
