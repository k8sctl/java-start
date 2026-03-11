package scanner.ex;

public class ChangeVarEx {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // 시작: 코드를 작성하세요.
        int temp; // 임시 변수 temp 선언
        temp = a; // a의 값을 temp에 복사
        a = b;    // b의 값을 a로 복사 (첫 번째 목표 성공)
        b = temp; // temp 변수에 저장한 a의 값을 b에 복사 (두 번째 목표 성공)
        // 종료: 코드를 작성하세요.

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
