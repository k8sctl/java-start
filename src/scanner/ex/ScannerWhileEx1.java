package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}

/*
이름을 입력하세요 (종료를 입력하면 종료): 자바
나이를 입력하세요: 30
입력한 이름: 자바, 나이: 30
이름을 입력하세요 (종료를 입력하면 종료): 나이를 입력하세요:

위 같은 문제점이 발생하는데
nextInt()가 30\n 했을 때
30만 가져가고 \n가 입력에 남아있는 것
그럼 다음 반복의 nextLine()에서 \n 이 입력으로 처리되면서 공백으로 처리된다.
그래서 input.nextLine(); 을 이용하는 처리가 필요하다.
*/
