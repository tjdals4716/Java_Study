package Object_Oriented_Programming;

import java.util.Scanner;

public class StudentAverage_Upgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"국어", "수학", "영어", "과학", "사회"};
        int[] scores = new int[subjects.length];
        String name;

        //사용자로부터 학생의 이름 입력받기
        System.out.print("학생의 이름을 입력하세요: ");
        name = scanner.nextLine();

        //사용자로부터 각 과목의 점수 입력받기
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + " 점수를 입력하세요: ");
            scores[i] = scanner.nextInt();
        }

        //Student 객체 생성
        Student_Upgrade student = new Student_Upgrade(name, scores);

        //평균 점수 계산
        double average = student.getAverage();

        //결과 출력
        System.out.println("학생 " + student.name + "의 평균 점수는: " + average + "입니다.");

        scanner.close();
    }
}

class Student_Upgrade {
    String name;
    int[] score;

    public Student_Upgrade(String name, int[] score) {
        this.name = name;
        this.score = score;
    }

    //평균 점수 계산 메서드
    public double getAverage() {
        int sum = 0;
        for (int scores : score) {
            sum += scores;
        }
        return (double) sum / score.length;
    }
}
