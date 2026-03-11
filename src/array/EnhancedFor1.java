package array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0 ; i < numbers.length ; i++) {
            System.out.print(numbers[i]);
        }

        System.out.println();

        // 향상된 for문, for-each문
        for (int number : numbers) {
            System.out.print(number);
        }

        System.out.println();

        // for-each 구문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for (int i = 0 ; i < numbers.length ; i++) {
            System.out.println("number " + i + "번의 결과는: " + numbers[i]);
        }

        System.out.println();

        // 물론 다음과 같이 억지스럽게 향상된 for문을 사용하는 것이 가능하지만, 이런 경우 일반 for문을 사용하는 것이 더 좋다.
        int i = 0;
        for (int number : numbers) {
            System.out.println("number " + i + "번의 결과는: " + number);
            i++;
        }
    }
}
