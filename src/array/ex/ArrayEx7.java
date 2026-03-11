package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int student_cnt = 4;
        int subject_cnt = 3;
        String[] subjects = {"국어", "영어", "수학"};

        int[][] scores = new int[student_cnt][subject_cnt];
        int[] sum = new int[student_cnt];
        double[] avg = new double[student_cnt];

        // 학생마다 과목별 점수를 입력 받음
        // 점수를 입력 받으면서 sum 배열에 총점 기록
        for (int i = 0 ; i < student_cnt ; i++){
            System.out.println((i+1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0 ; j < subject_cnt ; j++){
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = scanner.nextInt();
                sum[i] += scores[i][j];
            }
        }

        // 평균 계산 후, 평균 배열에 저장
        for (int i = 0 ; i < student_cnt ; i++) {
            avg[i] = (double) sum[i] / subject_cnt;
        }

        // 총점과 평균 배열에 저장한 값 출력
        for (int i = 0 ; i < student_cnt ; i++) {
            System.out.println((i+1) + "번 학생의 총점: " + sum[i] + ", 평균: " + avg[i]);
        }
    }
}
