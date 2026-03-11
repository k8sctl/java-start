package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        // int[] students = new int[]{90, 80, 70, 60, 50}; // 배열 생성 및 초기화
        int[] students = {90, 80, 70, 60, 50}; // new int[]를 생략하는 방법은 선언과 동시에만 사용할 수 있다.

        // 변수 값 사용
        for (int i = 0 ; i < students.length ; i++) {
            System.out.println("학생" + (i+1) + "의 점수: " + students[i]);
        }
    }
}
