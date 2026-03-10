package operator;

public class Operator1 {

    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);

    /*
        int z = 10 / 0; 과 같이 숫자는 0으로 나룰 수 없다.
        실행하면 아래와 같은 에러가 발생한다.
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at operator.Operator1.main(Operator1.java:30)
    */
    }
}
